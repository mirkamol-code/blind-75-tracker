package com.mirkamolcode.week_2;

public class FirstBadVersion{
    /**
     * @Time complexity: O(log n)
     * @Space complexity: O(1)
     * @param n
     */
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while (left < right) {
            int midPoint = left + (right - left) / 2;
            if (isBadVersion(midPoint)) {
                right = midPoint;
            }else{
                left = midPoint + 1;
            }
        }
        if (left == right && isBadVersion(left)) {
            return left;
        }

        return -1;
    }
}
