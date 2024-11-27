/*
 * @lc app=leetcode.cn id=2367 lang=java
 * @lcpr version=30204
 *
 * [2367] 等差三元组的数目
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            // 严格递增，相邻的差值差大于diff说明当前nums[i]不可能存在等差
            if (nums[i + 1] - diff > nums[i]
                    || nums[i + 2] - diff > nums[i + 1]) {
                continue;
            } else {
                // 双指针
                int slow = i + 1, fast = i + 2;
                while (slow < fast && fast < nums.length) {
                    if (nums[slow] - nums[i] == diff) {
                        if (nums[fast] - nums[slow] == diff) {
                            count++;
                            break;
                        } else {
                            fast++;
                        }
                    } else {
                        slow++;
                        fast++;
                    }
                }
            }
        }

        return count;
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [0,1,4,6,7,10]\n3\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [4,5,6,7,8,9]\n2\n
 * // @lcpr case=end
 * 
 */
