/*
 * @lc app=leetcode.cn id=2078 lang=java
 * @lcpr version=30204
 *
 * [2078] 两栋颜色不同且距离最远的房子
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxDistance(int[] colors) {
        int returnValue = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    returnValue = Math.max(returnValue, Math.abs(i - j));
                }
            }
        }
        return returnValue;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,1,6,1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,8,3,8,3]\n
// @lcpr case=end

// @lcpr case=start
// [0,1]\n
// @lcpr case=end

 */

