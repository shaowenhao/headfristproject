package advanced.threaddemo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Description: 解决线程安全问题 方式三 Lock锁
 *
 * date: 2020 2020/8/13 15:58
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.start();
        t2.start();
        t3.start();
    }

}

class Window implements Runnable{

    private int ticket = 100;
    // 实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
       // synchronized (this)  注意代码块的范围大了也不行 导致一个线程全部运行完退出

            while (true){
                // 把需要同步的代码放在try中
               try {
                   //调用lock方法
                   lock.lock();
                   if(ticket > 0){
                       try {
                           Thread.sleep(10);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       System.out.println(Thread.currentThread().getName()+":售票，票号为"+ticket);
                       ticket--;
                   }else{
                       break;
                   }
               }finally {
                      //调用解锁
                   lock.unlock();
               }
            }

    }
}