/*
 * @lc app=leetcode.cn id=1470 lang=java
 * @lcpr version=30111
 *
 * [1470] 重新排列数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        for (int i = 0; i < n; ++i) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n + i];
        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,5,1,3,4,7]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,4,3,2,1]\n4\n
// @lcpr case=end

// @lcpr case=start
// [1,1,2,2]\n2\n
// @lcpr case=end

 */

