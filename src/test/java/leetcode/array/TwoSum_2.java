package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:两数之和 Leetcode 1
 * // 暴力遍历O（n2）是最初想到的方法 这个方法 O(n)
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 画解.jpg
 * date: 2020 2020/7/24 21:55
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class TwoSum_2 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 7, 11};
        int target = 9;
        int[] nums = TwoSum_2.twoSum(array, target);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (!hashMap.containsKey(target - array[i])) {
                hashMap.put(array[i], i);
            }else{
                // 没写出来！！！！
                return new int[]{hashMap.get(target - array[i]),i};
            }

        }
     throw new IllegalArgumentException("no nums");
    }
}