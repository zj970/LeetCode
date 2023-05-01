/*
 * @lc app=leetcode.cn id=414 lang=java
 * @lcpr version=21907
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
        for (int i = 1, diff = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1] && ++diff == 3) { // 此时 nums[i] 就是第三大的数
                return nums[i];
            }
        }
        return nums[0];
    }

    public void reverse(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3, 2, 1]\n
// @lcpr case=end

// @lcpr case=start
// [1, 2]\n
// @lcpr case=end

// @lcpr case=start
// [2, 2, 3, 1]\n
// @lcpr case=end

 */

