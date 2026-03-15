package com.mirkamolcode.week_2;

public class BinarySearchAlgo {
    /**
     * @Time complexity: O(log n)
     * @Space complexity: O(1)
     * @param nums
     * @param target
     */
    public int searchByIterative(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            var middleOfArray = (low+high) / 2;
            var middleNumber = nums[middleOfArray];

            if(target == middleNumber){
                return middleOfArray;
            }
            if(target < middleNumber){
                high = middleOfArray - 1;
            }else{
                low = middleOfArray + 1;
            }
        }
        return -1;
    }
}
