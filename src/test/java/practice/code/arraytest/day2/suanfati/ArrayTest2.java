package practice.code.arraytest.day2.suanfati;

/**
 * Description:
 * date: 2020 2020/8/4 10:20
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ArrayTest2 {
    public static void main(String[] args) {

        int[] arry1,arry2;
        arry1 = new int[]{2,3,5,7,11,13,17,19};

        for(int i=0;i<arry1.length;i++){
            System.out.print(arry1[i]+ "\t");
        }
        //赋值arry2变量等于arry1
        //不能称作数组复制
        arry2 = arry1;
        for(int i=0;i<arry2.length;i++){
            if(i % 2 == 0){
                arry2[i] = i;
            }
        }
        System.out.println();
        //打印array1
         for(int i=0;i<arry1.length;i++){
             System.out.print(arry1[i] + "\t");
         }
    }
}
