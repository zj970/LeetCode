/*
 * @lc app=leetcode.cn id=2481 lang=java
 * @lcpr version=30204
 *
 * [2481] 分割圆的最少切割次数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        
        if (n % 2 == 0) {
            return n/2;
        }

        return n;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

 */

