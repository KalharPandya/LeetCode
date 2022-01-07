import java.math.*;
class Solution {
    public int maxProfit(int[] prices) {
        int max = prices[prices.length-1];
        int maxCp = 0;
        for (int i = prices.length-2; i >=0; i--) {
            max = Math.max(prices[i],max);
            maxCp = Math.max(maxCp, (max-prices[i]));

        }
        return maxCp;
    }
}