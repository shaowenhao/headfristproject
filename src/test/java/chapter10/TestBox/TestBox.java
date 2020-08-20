package chapter10.TestBox;

/**
 * Description:
 * date: 2020 2020/7/16 8:30
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
         TestBox t = new TestBox();
         t.go();
    }

    public void go(){
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
