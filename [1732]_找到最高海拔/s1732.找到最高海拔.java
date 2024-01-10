/*
 * @lc app=leetcode.cn id=1732 lang=java
 * @lcpr version=30113
 *
 * [1732] 找到最高海拔
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int largestAltitude(int[] gain) {
        int cur = 0, ans = 0;
        for (int x : gain) {
            cur += x;
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-5,1,5,0,-7]\n
// @lcpr case=end

// @lcpr case=start
// [-4,-3,-2,-1,4,3,2]\n
// @lcpr case=end

 */

