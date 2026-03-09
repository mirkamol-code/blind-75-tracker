package com.mirkamolcode.week_1;

public class MajorityElement {
    /**
     * @Time complexity: O(n2)
     * @Space complexity: O(1)
     * @param nums
     */
    public int majorityElementBruteForce(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (i == num) {
                    count++;
                }
            }
            if (count > n / 2) {
                return num;
            }
        }
        return -1;
    }
}
