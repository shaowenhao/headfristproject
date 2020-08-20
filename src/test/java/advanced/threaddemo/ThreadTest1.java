package advanced.threaddemo;

/**
 * Description:
 * date: 2020 2020/8/13 9:17
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
class MThread implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if(i % 2 ==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}


public class ThreadTest1 {
    public static void main(String[] args) {

        MThread m1 = new MThread();
        Thread t1 = new Thread(m1);
        t1.start();

        //再启动一个线程
        Thread t2 = new Thread(m1);
        t2.start();
    }
}
