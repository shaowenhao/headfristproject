package advanced.threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Description: 创建线程的方式 4 使用线程池
 * date: 2020 2020/8/15 12:57
 *
 * @author shaowenhao
 * @since JDK 1.8
 *
 */

class NumberThread implements  Runnable{
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


class NumberThread1 implements  Runnable{
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if(i%2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
       //1.提供指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // executorService.getClass()输出 ThreadPoolExecutor
        // 因为要体验控制线程 强转
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) executorService;
        service1.setCorePoolSize(10);
       // System.out.println(executorService.getClass());



        //2.执行执行线程的操作，需要提供实现Runnable接口
        executorService.execute(new NumberThread());  //适合使用Runnable
        executorService.execute(new NumberThread1());  //适合使用Runnable

        //关闭连接池
        executorService.shutdown();

       // executorService.submit(); //适合使用Callable
    }
}
