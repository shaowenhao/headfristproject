package practice.code.arraytest.day2.suanfati;

import org.junit.jupiter.api.Test;

/**
 * Description:
 * date: 2020 2020/8/4 10:37
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ArrayTest3 {
    public static void main(String[] args) {

        int[] arry1,arry2;
        arry1 = new int[]{2,3,5,7,11,13,17,19};

        for(int i=0;i<arry1.length;i++){
            System.out.print(arry1[i]+ "\t");
        }
        //赋值arry2变量等于arry1

        //数组复制
        arry2 = new int[arry1.length];
        for(int i=0;i<arry2.length;i++){
            arry2[i] = arry1[i];
        }


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

        //数组的反转
        String[] arr = new String[]{"JJ","DD","MM","GG"};
//       方法一
//        for(int i = 0; i< arr.length / 2;i++){
//            String temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
        //方式二 头尾指针向左右移动
        String[] arr2 = new String[]{"JJ","DD","MM","GG"};
        for(int i = 0,j=arr2.length -1;i<j;i++,j--){
            String temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
        }

         for(int i=0;i<arr2.length;i++){
              System.out.print(arr2[i]+ "\t");
          }

    }

    //线性查找
    @Test
    void search(){
        String[] arr = new String[]{"JJ","DD","MM","GG"};
        String dest = "JJ";
        boolean isFlag = true;
        for(int i=0;i<arr.length;i++){
            if(dest.equals(arr[i])){
                System.out.println("find it index at@" + i);
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.println("not find it");
        }
    }

    //二分法查找 前提所有查找的数组有序
    @Test
    void binarySearch(){
        int[] arr = new int[]{-98,-34,2,34,54,66,79};
        //int dest = -34;
        int dest = 7;
        int head = 0;
        int end = arr.length - 1;
        boolean isFlag = true;
        while(head <= end){
            int middle = (head + end)/2;
            if(dest == arr[middle]){
                System.out.println("find it @" + middle);
                 isFlag = false;
                 break;
            }else if(arr[middle] > dest){
                 end = middle - 1;
            }else{
                head = middle + 1;
            }
        }
        if(isFlag){
            System.out.println(" not find it");
        }
    }
}
