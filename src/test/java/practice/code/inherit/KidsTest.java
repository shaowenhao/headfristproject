package practice.code.inherit;

/**
 * Description:
 * date: 2020 2020/8/6 21:33
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class KidsTest {
    public static void main(String[] args) {

        Kids someKid = new Kids(22);
        someKid.printAge();
        someKid.setSalary(1000);
        someKid.employeed();
        someKid.setSex(1);
        someKid.manOrWoman();
    }
}
