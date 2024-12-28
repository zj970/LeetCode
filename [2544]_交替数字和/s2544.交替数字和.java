/*
 * @lc app=leetcode.cn id=2544 lang=java
 * @lcpr version=30204
 *
 * [2544] 交替数字和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int alternateDigitSum(int n) {
       int res = 0, sign = 1;
       while (n > 0) {
            res += n % 10 * sign;
            sign = -sign;
            n /= 10;
       }
    
       return -sign * res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 521\n
// @lcpr case=end

// @lcpr case=start
// 111\n
// @lcpr case=end

// @lcpr case=start
// 886996\n
// @lcpr case=end

 */

