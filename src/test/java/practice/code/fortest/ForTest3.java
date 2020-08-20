package practice.code.fortest;

import org.junit.jupiter.api.Test;

/**
 * Description: 嵌套循环技巧
 * 外层循环控制行数
 * 内层循环控制列数
 * date: 2020 2020/7/31 17:19
 *打印
 * *
 * **
 * ***
 * ****
 * *****
 *
 * @author shaowenhao
 * @since JDK 1.8
 */

public class ForTest3 {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
            System.out.println();
        }
    }


/*

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
 */

    @Test
    void test2(){
       //上半部
        int space = 0;
       for(int i=0;i<5;i++) {

           for(int k=0; k<4-i;k++) {
               System.out.print(" ");
           }

           for(int j=0;j<i+1;j++){
               System.out.print("* ");
           }
           System.out.println();
       }

        //下半部
        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }

            for(int k=0;k<4 -i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
