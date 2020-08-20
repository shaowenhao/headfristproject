package practice.code.inherit;

/**
 * Description:
 * date: 2020 2020/8/7 8:36
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();

        order.orderDefault =1;
        order.orderProtected =2;
        order.orderPublic =3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //同一个包中的其他类 不可以调用Order类中的私有属性，方法


    }
}
