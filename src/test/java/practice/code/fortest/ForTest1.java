package practice.code.fortest;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * Description:
 * date: 2020 2020/7/31 15:24
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ForTest1 {
    @Test
    void  test(){

        for(int i=0;i<=150;i++){
            System.out.print(i+ " ");
          if(i % 3 == 0){
              System.out.print("foo");
          }
          if(i % 5 == 0){
              System.out.print("biz");
          }
          if(i % 7 == 0){
              System.out.print("baz");
          }
            System.out.println();
        }
    }


    @Test
    void test2(){
        int a = 1;
        int b = 2;
        int c = (a == b) ? a : b;
        System.out.println(c);
    }

    @Test
    void test3(){
        Scanner sc = new Scanner(System.in);
        String info  = sc.next();
        int num = sc.nextInt();
    }


}
