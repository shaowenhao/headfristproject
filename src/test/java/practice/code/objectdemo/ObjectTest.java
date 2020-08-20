package practice.code.objectdemo;

/**
 * Description:
 * date: 2020 2020/8/7 15:17
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ObjectTest {
    public static void main(String[] args) {

        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());

    }
}

class Order{

}