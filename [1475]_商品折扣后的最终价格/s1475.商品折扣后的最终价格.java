/*
 * @lc app=leetcode.cn id=1475 lang=java
 * @lcpr version=30111
 *
 * [1475] 商品折扣后的最终价格
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;

        int[] res = new int[len];

        for (int i = 0; i < len; ++i) {
            int price = prices[i];
            int j = i + 1;
            for (; j < len; ++j) {
                if (prices[j] <= price) {
                    res[i] = price - prices[j];
                    break;
                }
            }

            if(j == len) res[i] = price;
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,4,6,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [10,1,1,6]\n
// @lcpr case=end

 */

