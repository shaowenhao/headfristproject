package practice.code.interfacedemo;

/**
 * Description:
 * date: 2020 2020/8/11 14:11
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ComparableCitcleTest {

    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(3.1);
        ComparableCircle c2 = new ComparableCircle(3.6);
        int compareValue = c1.compareTo(c2);
        if(compareValue > 0){
            System.out.println("c1da ");
        }else if(compareValue < 0){
            System.out.println("c2 da");
        }else{
            System.out.println("c1 same as c2");
        }
    }

}
