package practice.code.fortest;

/**
 * Description:
 * date: 2020 2020/8/1 20:30
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class NineNineTable {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){

            for (int j=1;j<=i;j++){
                System.out.print(i + "*" + j + "=" + (i*j) + " ");
            }
            System.out.println();
        }

    }
}
