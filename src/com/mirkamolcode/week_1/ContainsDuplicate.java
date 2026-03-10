package com.mirkamolcode.week_1;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    /**
     * @Time complexity: O(n)
     * @Space complexity: O(n)
     * @param nums
     */
    public boolean hasDuplicateWithHashSet(int[] nums) {
        HashSet<Integer> distinctNumbers = new HashSet<Integer>();
        for(int number : nums){
            if(distinctNumbers.contains(number)){
                return true;
            }
            distinctNumbers.add(number);
        }
        return false;
    }

    /**
     * @Time complexity: O(n2)
     * @Space complexity: O(1)
     * @param nums
     */
    public boolean hasDuplicateWithBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @Time complexity: O(n log n)
     * @Space complexity: O(1/n)
     * @param nums
     */
    public boolean hasDuplicateBySorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
