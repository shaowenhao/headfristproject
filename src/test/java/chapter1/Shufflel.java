package chapter1;

/**
 * Description:
 * date: 2020 2020/7/10 11:21
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Shufflel {
    public static void main(String[] args) {
        int x = 3;
        while(x > 0){
            if(x > 2){
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if(x == 2){
                System.out.print("b c");
            }
            if(x == 1){
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
