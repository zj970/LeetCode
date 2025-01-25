/*
 * @lc app=leetcode.cn id=2729 lang=java
 * @lcpr version=30204
 *
 * [2729] 判断一个数是否迷人
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isFascinating(int n) {
        if (n < 123 || n > 329) {
            return false;
        }
        int mask = 0;
        for(char c : ("" + n + (n*2) + (n*3)).toCharArray()) {
            mask |= 1 << (c-'0');
        }

        return mask == (1 << 10) - 2;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 192\n
// @lcpr case=end

// @lcpr case=start
// 100\n
// @lcpr case=end

 */

