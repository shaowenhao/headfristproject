package advanced.threaddemo;

import javax.swing.plaf.TableHeaderUI;

/**
 * Description:演示线程的死锁问题
 * date: 2020 2020/8/13 15:07
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ThreadLock {
    public static void main(String[] args) {

      StringBuffer s1 = new StringBuffer();
      StringBuffer s2 = new StringBuffer();


        new Thread(){
            @Override
            public void run() {
              synchronized (s1){
                  s1.append("a");
                  s2.append("1");
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  synchronized (s2){
                      s1.append("b");
                      s2.append("2");
                  }
                  System.out.println(s1);
                  System.out.println(s2);
              }
            }
        }.start();

       new Thread(new Runnable() {
           @Override
           public void run() {
               synchronized (s2){
                   s1.append("c");
                   s2.append("3");
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (s1){
                       s1.append("d");
                       s2.append("4");
                   }
                   System.out.println(s1);
                   System.out.println(s2);
               }
            }
       }).start();

    }
}
