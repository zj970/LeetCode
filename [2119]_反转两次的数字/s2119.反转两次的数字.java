/*
 * @lc app=leetcode.cn id=2119 lang=java
 * @lcpr version=30204
 *
 * [2119] 反转两次的数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10!= 0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 526\n
// @lcpr case=end

// @lcpr case=start
// 1800\n
// @lcpr case=end

// @lcpr case=start
// 0\n
// @lcpr case=end

 */

