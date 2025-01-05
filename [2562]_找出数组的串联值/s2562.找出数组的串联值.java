/*
 * @lc app=leetcode.cn id=2562 lang=java
 * @lcpr version=30204
 *
 * [2562] 找出数组的串联值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0;
        // 定义一个左指针，右指针
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            // 串联还是直接相加
            if (right == left) {
                res += nums[left];
            } else {
                // 串联操作
                res += Integer.parseInt(Integer.toString(nums[left]) + Integer.toString(nums[right]));
            }
            right--;
            left++;
        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,52,2,4]\n
// @lcpr case=end

// @lcpr case=start
// [5,14,13,8,12]\n
// @lcpr case=end

 */

