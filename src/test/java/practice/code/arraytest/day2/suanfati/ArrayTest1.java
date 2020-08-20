package practice.code.arraytest.day2.suanfati;

/**
 * Description:
 * date: 2020 2020/8/4 9:57
 *
 * 定义一个int型的一维数组 包含10个元素 分别赋值一些随机数
 * 然后求出所有元素最大值，最小值，和，平均值
 * 要求 所有随机数都是两位数
 *[10,99] (int)(Math.random()*(99-10+1)+10)
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ArrayTest1 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0;i<arr.length;i++){
             arr[i] = (int)(Math.random()*(99-10+1)+10);
        }

        //遍历
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        //求最大值
        int maxValue = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("maxvalue" + maxValue);

        int minValue = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("minvalue" + minValue);



    }
}
