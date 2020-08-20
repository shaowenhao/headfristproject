package practice.code.arraytest.day1;

import java.util.Scanner;

/**
 * Description:
 * date: 2020 2020/8/3 16:25
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ArrayDemo1 {
    public static void main(String[] args) {

        //使用Scanner 读取学生个数
        // 创建数组 存储学生成绩 动态初始化
        // 给数组中的元素赋值
        // 获取数组中元素的最大值
        // 根据每个学生与最高分的差值，得到等级 并输出

        Scanner sc = new Scanner(System.in);
        System.out.println("input students nums:");
        int nums = sc.nextInt();
        int[] results = new int[nums];
        System.out.println("input" + nums + "results");
        for (int i=0; i< nums;i++){
            results[i] = sc.nextInt();
        }
        int maxResult = 0;
        for(int i=0; i<results.length;i++){
            if(maxResult < results[i]){
                maxResult = results[i];
            }
        }
        char level ;
        for(int i=0;i<results.length;i++){
            if(maxResult - results[i] <=10){
                level = 'A';
            }else if(maxResult - results[i] <=20){
                level = 'B';
            }else if(maxResult - results[i]<=30){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("student" + i +"result is"+results[i]+"grade is"+ level);
        }
    }
}
