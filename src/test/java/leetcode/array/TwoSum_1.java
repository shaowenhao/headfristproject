package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:两数之和 Leetcode 1
 * // 暴力遍历O（n2）是最初想到的方法 这个方法 O(n)
 * 画解.jpg
 * date: 2020 2020/7/24 21:55
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class TwoSum_1 {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,7,11};
        int target = 9;

        TwoSum_1 t = new TwoSum_1();
        int[] nums = t.twoSum(array, target);
        System.out.println(Arrays.toString(nums));
    }

    public int[] twoSum(int[] array, int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(target - array[i])){
                return new int[]{map.get(target - array[i]),i};
            }
            map.put(array[i],i);
        }
        throw new IllegalArgumentException("No two sum");
    }
}
