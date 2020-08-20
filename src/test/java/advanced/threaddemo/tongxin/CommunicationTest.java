package advanced.threaddemo.tongxin;

/**
 * Description:使用两个线程打印1-100 线程1 线程2交替打印
 * date: 2020 2020/8/13 17:12
 *
 * @author shaowenhao
 * @since JDK 1.8
 */

class Number implements Runnable{

    private int number = 1;
    @Override
    public void run() {

        // 线程一进来第一次notify()不用管没有实际发生作用，执行到wait，释放锁
        // 线程二进来 唤醒线程一，执行到wait，释放锁
        // 线程一又进来，唤醒线程二，.....
        while (true){
            synchronized (this) {
                notify();
                if(number <= 100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;

                    // 某一个线程进来
                    try {
                        //使得调用如下 wait()方法的线程进入阻塞状态
                        // 执行到wait语句和sleep不同，sleep睡着了依然拿着锁，wait执行的时候释放锁
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {

        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }

}
