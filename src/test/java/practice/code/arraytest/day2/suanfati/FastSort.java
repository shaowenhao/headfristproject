package practice.code.arraytest.day2.suanfati;

import java.util.Arrays;

/**
 * Description:
 * date: 2020 2020/8/4 13:20
 *快速排序
 *  * 通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，
 *  * 则分别对这两部分继续进行排序，直到整个序列有序。
 * @author shaowenhao
 * @since JDK 1.8
 */
public class FastSort {
    public static void main(String[] args) {
        int[] arr = {-9,78,0,23,-567,70};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left, int right){
        int l = left;
        int r = right;
        int pivot = (left + right) / 2;
        int temp = 0;
        // while循环的目的是让比pivot值小的放到左边
        // 比pivot值大的放到右边
        while( l < r){
           // 在pivot的左边一直找 找到大于等于pivot的值 才退出
            while(arr[l] < pivot){
                l+=1;
            }
            // 在pivot的右边一直找 找到小于等于pivot的值 才退出
            while(arr[r] > pivot){
                r -= 1;
            }
            //如果l>=r 说明 pivot的左右两的值，已经按照左边全部是小于等于pivot，
            //右边全部大于等于pivot
           if(l >= r){
               break;
           }
           //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //交换完后发现arr[l] == pivot r-- 前移
            if(arr[l] == pivot){
                r -= 1;
            }
            if(arr[r] == pivot){
                l+= 1;
            }
        }

         if(l == r){
             l+=1;
             r-=1;
         }
         if(left < r){
             quickSort(arr,left,r);
         }
         if(right > l){
             quickSort(arr,l,right);
         }
    }
}
