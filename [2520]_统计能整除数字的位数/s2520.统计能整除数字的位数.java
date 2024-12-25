/*
 * @lc app=leetcode.cn id=2520 lang=java
 * @lcpr version=30204
 *
 * [2520] 统计能整除数字的位数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countDigits(int num) {
        int n = num, ans = 0;
        while (num != 0) {
            ans += n % (num % 10) == 0 ? 1 : 0;
            num /= 10;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n
// @lcpr case=end

// @lcpr case=start
// 121\n
// @lcpr case=end

// @lcpr case=start
// 1248\n
// @lcpr case=end

 */

