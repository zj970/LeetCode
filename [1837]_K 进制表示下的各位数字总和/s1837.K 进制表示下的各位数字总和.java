/*
 * @lc app=leetcode.cn id=1837 lang=java
 * @lcpr version=30115
 *
 * [1837] K 进制表示下的各位数字总和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int sumBase(int n, int k) {
        int ans = 0;
        while (n > 0) {
            ans += n % k;
            n /= k;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 34\n6\n
// @lcpr case=end

// @lcpr case=start
// 10\n10\n
// @lcpr case=end

 */

