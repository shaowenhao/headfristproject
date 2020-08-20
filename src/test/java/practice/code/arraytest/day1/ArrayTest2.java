package practice.code.arraytest.day1;

/**
 * Description: 二维数组的使用
 * date: 2020 2020/8/3 16:47
 *
 * @author shaowenhao
 * @since JDK 1.8
 *
 * 对于二维数组的理解 看成是一维数组array1又作为另一个一维数组array2的元素而存在
 * 一个数组的元素又是一个数组！！！
 *
 */
public class ArrayTest2 {
    public static void main(String[] args) {

        // 二维数组的声明和初始化
        int[] arr = new int[]{1,2,3};

        //二维数组理解为一个数组里的元素 又是数组
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};

        //动态初始化
        String[][] arr2 = new String[3][2]; //堆里先有一个一维数组有3个元素，每个元素又是一个数组 有2个元素
        String[][] arr3 = new String[3][];  //堆里先有一个一维数组有3个元素，每个元素暂不赋值

        // 两种理解 1.几行几列 2.第几个数组里的第几个元素

        //二维数组元素调用
        System.out.println(arr1[0][1]);  //2
        System.out.println(arr2[1][1]);  //

        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);

        //获取数组的长度
        System.out.println(arr1.length); //3

        //如何遍历二维数组
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
