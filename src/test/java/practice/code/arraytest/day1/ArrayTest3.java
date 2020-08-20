package practice.code.arraytest.day1;

/**
 * Description:
 * date: 2020 2020/8/3 21:54
 * 二维数组：分为外层数组的元素，内层数组的元素
 * 外层元素： arr[0],arr[1]
 * 内层元素: arr[0][0],arr[1][2]等
 *
 * @author shaowenhao
 * @since JDK 1.8
 *
 * int[][] arr = new int[4][3]
 * 外层元素的初始化值为 地址值
 * 内层元素的初始化值为 与一维数组初始化情况相同
 *
 * int[][] arr = new int[4][]
 * 外层元素初始化值为 null
 * 内层元素初始化 不能调用NPE
 * */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);
        /*
        [I@13221655
        0
        */
        String[][] arr2 = new String[4][2];
        System.out.println(arr2[1]);
        System.out.println(arr2[1][1]);
        /*
        [Ljava.lang.String;@2f2c9b19
        null
         */

        //因为二维没有数字进行初始化
        double[][] arr3 = new double[4][];
        System.out.println(arr3[1]); // null
        System.out.println(arr3[1][0]); //NPE

    }
}
