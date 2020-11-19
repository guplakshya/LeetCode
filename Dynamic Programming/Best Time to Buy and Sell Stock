########## Best Time to Buy and Sell stock ###############

/*

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example:

Input: [7,1,5,3,6,4]
Output: 5

*/

Java Solution:

public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)
                min = prices[i];
            else if(prices[i]-min>max)
                max = prices[i]-min;
        }
        return max;
    }
