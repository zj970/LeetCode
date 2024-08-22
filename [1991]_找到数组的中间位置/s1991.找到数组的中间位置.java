/*
 * @lc app=leetcode.cn id=1991 lang=java
 * @lcpr version=30204
 *
 * [1991] 找到数组的中间位置
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findMiddleIndex(int[] nums) {
        int index = 0;

        int left, right;

        while (index < nums.length) {
            left = 0;
            right = 0;
            for (int i = 0; i < index; i++) {
                left += nums[i];
            }
            for (int i = index + 1; i < nums.length; i++) {
                right += nums[i];
            }
            if (left == right) {
                return index;
            }
            index++;
        }

        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,-1,8,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,-1,4]\n
// @lcpr case=end

// @lcpr case=start
// [2,5]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

