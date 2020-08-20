package practice.code.inherit2;

import practice.code.inherit.Order;

/**
 * Description:
 * date: 2020 2020/8/7 8:40
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class SubOrder extends Order {

    public static void main(String[] args) {


    }

    public  void method(){
        orderProtected = 1;
        orderPublic = 2;

        // 在不同包的子类中，不能调用Order类声明为private 和 缺省权限的
        //属性和方法
//        orderDefault = 3;
//        orderPrivate = 4;
    }
}
