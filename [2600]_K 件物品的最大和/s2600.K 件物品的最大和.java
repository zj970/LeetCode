/*
 * @lc app=leetcode.cn id=2600 lang=java
 * @lcpr version=30204
 *
 * [2600] K 件物品的最大和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (numOnes > k) {
            return k;
        }

        if (numZeros >= k - numOnes) {
            return numOnes;
        }

        return numOnes - (k - numOnes - numZeros);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n2\n0\n2\n
// @lcpr case=end

// @lcpr case=start
// 3\n2\n0\n4\n
// @lcpr case=end

 */

