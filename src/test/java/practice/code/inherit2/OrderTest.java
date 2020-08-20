package practice.code.inherit2;

import com.sun.org.apache.xpath.internal.operations.Or;
import practice.code.inherit.Order;

/**
 * Description:
 * date: 2020 2020/8/7 8:44
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //不同包下的普通类要使用Order类不可以调用private 缺省的 protected的属性 方法
        order.methodPublic();
        order.orderPublic = 1;
    }

}
