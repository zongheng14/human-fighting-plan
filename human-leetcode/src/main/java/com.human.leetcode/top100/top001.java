package com.human.leetcode.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shaonan.hu
 * @version V1.0
 * @title 两数之和
 * @link https://leetcode-cn.com/problems/two-sum/
 * @Time 2020/10/22
 */
public class top001 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 22;
        // int[] ints = twoSum(nums, target); //方式一
        int[] ints = twoSum2(nums, target); //方式二
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    /**
     * 方法1 ： 暴力破解
     * 根据示例，target = 9; 正常两个数 a + b = 9 ，--> 9 - a = b
     * 思路：利用两个for循环实现，外层：控制数组中第i位置的数，内层：控制第i+1 位的数值
     * 分析：这种方式需要使用两次for循环，时间复杂度为O(n^2) ,不太合适
     */
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //利用 b = 9 - a
                if (nums[j] == (target - nums[i])) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 方式2
     * 基于方式1的 O(n^2) ,进行改良 只用一次for循环，结合map，因为map的get是O(1)
     * 这种只有一个循环，时间复杂度就是O(n)
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
