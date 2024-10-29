/*
 * @lc app=leetcode.cn id=2210 lang=java
 * @lcpr version=30204
 *
 * [2210] 统计数组中峰和谷的数量
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countHillValley(int[] nums) {
        int statue = 0, n = 0;// 状态和计数
        for (int i = 1; i < nums.length; i++)// 遍历一遍数组
        {
            if (nums[i - 1] < nums[i])// 现在上升
            {
                if (statue == -1) // 之前下降
                    ++n; // 是谷
                statue = 1; // 更改之前状态
            } else if (nums[i - 1] > nums[i])// 现在下降
            {
                if (statue == 1) // 之前上升
                    ++n; // 是峰
                statue = -1; // 更改之前状态
            }
        }
        return n;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,4,1,1,6,5]\n
// @lcpr case=end

// @lcpr case=start
// [6,6,5,5,4,1]\n
// @lcpr case=end

 */

