package com.mirkamolcode.week_1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * @Time complexity: O(n2)
     * @Space complexity: O(1)
     *
     * @param nums
     * @param target
     * @return int[]
     */
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * @Time complexity: O(n log n)
     * @Space complexity: O(n)
     * @param nums
     * @param target
     * @return intp[[
     */
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];
    }
}
