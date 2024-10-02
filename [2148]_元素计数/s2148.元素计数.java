/*
 * @lc app=leetcode.cn id=2148 lang=java
 * @lcpr version=30204
 *
 * [2148] 元素计数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            boolean smaller = false, bigger = false;
            for (int j = 0; j < len; j++) {
                if (nums[i] < nums[j]) {
                    smaller = true;
                }
                if (nums[i] > nums[j]) {
                    bigger = true;
                }
            }

            if (bigger && smaller) {
                count++;
            }
        }

        return count;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [11,7,2,15]\n
// @lcpr case=end

// @lcpr case=start
// [-3,3,3,90]\n
// @lcpr case=end

 */

