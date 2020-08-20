package practice.code.staticdemo;

/**
 * Description:
 * date: 2020 2020/8/10 9:37
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class SingletonTest1 {
    public static void main(String[] args) {
         // Bank bank1 = new Bank();
       Bank bank1 = Bank.getInstance();
       Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}

//饿汉式 一上来就造好 不存在线程安全问题
class Bank{
    //1 私有化类的构造器
      private Bank(){

      }
       // 创内部创建类的对象
      // 要求此对象也必须声明为静态的
      private  static Bank instance = new Bank();

      public  static Bank getInstance(){
          return instance;
      }
}