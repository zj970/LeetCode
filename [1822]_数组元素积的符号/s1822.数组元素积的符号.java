/*
 * @lc app=leetcode.cn id=1822 lang=java
 * @lcpr version=30114
 *
 * [1822] 数组元素积的符号
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                sign = -sign;
            }
        }
        return sign;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-1,-2,-3,-4,3,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,5,0,2,-3]\n
// @lcpr case=end

// @lcpr case=start
// [-1,1,-1,1,-1]\n
// @lcpr case=end

 */

