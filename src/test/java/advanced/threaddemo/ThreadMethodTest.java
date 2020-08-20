package advanced.threaddemo;

import java.util.SortedMap;

/**
 * Description:测试Thread常用方法
 * date: 2020 2020/8/12 17:07
 *
 * start()启动当前线程 调用当前线程的run()
 * run() 通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * currentThread() 静态方法 返回执行当前代码的线程
 * getName() 获取当前线程的名字
 * setName() 设置当前线程的名字
 * yield() 释放当前cpu的执行权(下一刻可能还是该线程得到资源)
 * join() 在线程a中调用线程b的join()，此时线程a就进入阻塞状态，只带线程b完全执行完以后，线程a才结束阻塞状态
 * sleep(long millitime) 让当前线程睡眠制定的毫秒，在指定的时间内，当前线程是阻塞状态。
 * isAlive() 判断当前线程是否存活
 *
 *
 * 获取和设置当前线程的优先级 高优先级从概率上讲
 * getPriority() 获取线程的优先级
 * setPriority(int p) 设置线程的优先级
 *
 * @author shaowenhao
 * @since JDK 1.8
 */

class HelloThread extends Thread{

    public HelloThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i =0;i<100;i++){
            if(i % 2 == 0){
                try {
                    HelloThread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

//            if(i % 20 ==0){
//                yield();
//            }
        }
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
          HelloThread h1 = new HelloThread("线程 一");
          //线程起名字
          //h1.setName("线程1");
          h1.start();

          Thread.currentThread().setName("主线程");
          for (int i = 0;i < 100;i++){
              if(i % 2 == 0){
                  System.out.println(Thread.currentThread().getName()+":"+i);
              }

              if(i == 20){
                  try {
                      h1.join();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
    }
}

