package practice.code.staticdemo;

/**
 * Description:
 * date: 2020 2020/8/10 9:49
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }

}
//懒汉式 啥时候用啥时候造， 目前的写法存在线程安全问题
class Order {
    private Order(){

    }

    private static Order instance = null;

    public static Order getInstance(){

        synchronized (Order.class) {
            if(instance == null){
               instance = new Order();
                System.out.println("aaa");
            }
            return instance;
        }
    }
}