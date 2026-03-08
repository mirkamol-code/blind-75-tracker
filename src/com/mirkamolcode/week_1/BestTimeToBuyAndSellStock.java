package com.mirkamolcode.week_1;

public class BestTimeToBuyAndSellStock {
    /**
     * @Time complexity: O(n)
     * @Space complexity: O(1)
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxP = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
