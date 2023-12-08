/*
 * @lc app=leetcode.cn id=1486 lang=java
 * @lcpr version=30111
 *
 * [1486] 数组异或操作
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int xorOperation(int n, int start) {
        int res = start;
        for (int i = 1; i < n; ++i) {
            res ^= (start + 2 * i);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n0\n
// @lcpr case=end

// @lcpr case=start
// 4\n3\n
// @lcpr case=end

// @lcpr case=start
// 1\n7\n
// @lcpr case=end

// @lcpr case=start
// 10\n5\n
// @lcpr case=end

 */

