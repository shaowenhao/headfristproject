package practice.code.oop.constructor;

/**
 * Description:
 * date: 2020 2020/8/5 10:05
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class TriAngleTest {
    public static void main(String[] args) {

        TriAngle t1 = new TriAngle();
        System.out.println(t1.getBase());
        System.out.println(t1.getHeight());

        t1.setBase(2.0);
        t1.setHeight(2.4);
        System.out.println(t1.getBase());
        System.out.println(t1.getHeight());

        TriAngle t2 = new TriAngle(5.1,5.6);
        System.out.println(t2.getBase());
        System.out.println(t2.getHeight());
    }
}
