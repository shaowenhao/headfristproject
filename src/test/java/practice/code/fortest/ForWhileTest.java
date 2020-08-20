package practice.code.fortest;

import java.util.Scanner;

/**
 * Description:
 * 键盘读入个数不确定的整数，判断读入的整数和负数的个数，输入0结束程序
 * date: 2020 2020/7/31 16:26
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ForWhileTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int positiveNum = 0;
        int negativeNum = 0;
        while (flag){
            int number = scan.nextInt();
            if(number > 0){
                positiveNum++;
            }
            else if(number < 0){
                negativeNum++;
            }else {
                flag = false;
            }
        }

        System.out.println("整数个数:"+positiveNum+"负数个数为："+negativeNum);
    }

}
