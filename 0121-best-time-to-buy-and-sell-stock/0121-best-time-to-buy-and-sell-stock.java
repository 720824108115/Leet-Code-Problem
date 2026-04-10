class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                // Found a new potential buying point
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                // Found a better day to sell relative to our minPrice
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}