package practice.code.arraytest.day2.suanfati;

/**
 * Description:
 * date: 2020 2020/8/4 13:04
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[]{43,32,76,0,64,99};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
                    swap(arr,j,j+1);
                }
            }
        }



        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
