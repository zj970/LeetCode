/*
 * @lc app=leetcode.cn id=461 lang=java
 * @lcpr version=21907
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1\n4\n
// @lcpr case=end

// @lcpr case=start
// 3\n1\n
// @lcpr case=end

 */

