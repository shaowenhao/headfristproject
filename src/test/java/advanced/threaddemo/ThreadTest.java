package advanced.threaddemo;

/**
 * Description:
 * date: 2020 2020/8/12 13:30
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("hello");
    }

}

class MyThread extends  Thread{
    @Override
    public void run() {
        for(int i =0; i<100;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}