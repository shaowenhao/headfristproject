package advanced.threaddemo;

/**
 * Description:使用同步机制将单例模式的懒汉式改写为线程安全
 * date: 2020 2020/8/13 14:45
 *
 * @author shaowenhao
 * @since JDK 1.8
 */



public class BankTest {

}

class Bank{

   private  Bank(){

   }

   private static Bank instance = null;

  // public synchronized static Bank getInstance(){
   public  static Bank getInstance(){
       //在方法上加synchronized的功能与
       //synchronized(Bank.class)一样

       synchronized (Bank.class) {
           if (instance == null){
               instance = new Bank();
           }
           return instance;
       }
   }
}
