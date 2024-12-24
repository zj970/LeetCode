/*
 * @lc app=leetcode.cn id=2511 lang=java
 * @lcpr version=30204
 *
 * [2511] 最多可以摧毁的敌人城堡数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int captureForts(int[] forts) {
        int ans = 0, pre = -1;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1 || forts[i] == -1) {
                if (pre >= 0 && forts[i] != forts[pre]) {
                    ans = Math.max(ans, i - pre - 1);
                }
                pre = i;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,0,0,-1,0,0,0,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [0,0,1,-1]\n
// @lcpr case=end

 */

