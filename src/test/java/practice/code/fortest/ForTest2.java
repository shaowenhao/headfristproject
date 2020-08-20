package practice.code.fortest;

import org.junit.jupiter.api.Test;

import static java.lang.Integer.parseInt;

/**
 * Description:
 * date: 2020 2020/7/31 15:51
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ForTest2 {
    // 打印水仙花数 3位数 各个位数的立方 和 等于 数字本身

    //虽然成功了 但是 很坑爹 个 十 百位判断！！
    @Test
    void test(){

        for(int i=100;i<1000;i++){
            String num = String.valueOf(i);
            int sum=0;
            int n=0;
            for(int j=0;j<num.length();j++){
                 n = Integer.parseInt(String.valueOf(num.charAt(j)));
                 sum += n * n * n;
            }
            if(i == sum){
                System.out.println("水仙花数:" + i);
            }
        }
    }


    @Test
    void test2(){

        for(int i=100;i<1000;i++){
             int ge = i % 10;
             int shi = i % 100 / 10;
             int bai = i / 100;
             int sum = 0;
             sum += Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);

             if (i == sum){
                 System.out.println("水仙花数："+ i);
             }
        }
    }
}
