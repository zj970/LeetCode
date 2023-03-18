/*
 * @lc app=leetcode.cn id=121 lang=java
 * @lcpr version=21801
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        //  暴力枚举会导致超时
        // int profit  = 0;
        // for (int i = 0; i < prices.length - 1; i++) {
        //     for(int j = i+1; j<prices.length;j++){
        //         int tmp = prices[j] - prices[i];
        //         if(tmp>profit){
        //             profit = tmp;
        //         }
        //     }
        // }
        // return profit;

        int minPirce  = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if(prices[i] < minPirce){
                minPirce = prices[i];
            } else if(prices[i] - minPirce > maxProfit){
                maxProfit = prices[i] - minPirce;
            }
        }

        return maxProfit;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// 
// @lcpr case=end

// @lcpr case=start
// [7,6,4,3,1]\n
// @lcpr case=end

 */


