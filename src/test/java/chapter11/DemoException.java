package chapter11;

/**
 * Description:
 * date: 2020 2020/7/16 10:11
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class DemoException {

    public static void main(String[] args) {

       int i = 10;
       int  j= 0;
        try {
          int y =  i / j;
        } catch (Exception e) {
            System.out.println("failed");
            return;
        }

        System.out.println("done");
    }
}
