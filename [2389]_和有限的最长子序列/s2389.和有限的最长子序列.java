/*
 * @lc app=leetcode.cn id=2389 lang=java
 * @lcpr version=30204
 *
 * [2389] 和有限的最长子序列
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1]; // 原地求前缀和
        }
        for (int i = 0; i < queries.length; i++) {
            queries[i] = upperBound(nums, queries[i]); // 复用 queries 作为答案
        }
        return queries;
    }
    
    // https://www.bilibili.com/video/BV1AP41137w7/
    // 返回 nums 中第一个大于 target 的数的下标（注意是大于，不是大于等于）
    // 如果这样的数不存在，则返回 nums.length
    // 时间复杂度 O(log nums.length)
    // 采用开区间写法实现
    private int upperBound(int[] nums, int target) {
        int left = -1, right = nums.length; // 开区间 (left, right)
        while (left + 1 < right) { // 区间不为空
            // 循环不变量：
            // nums[left] <= target
            // nums[right] > target
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid; // 范围缩小到 (left, mid)
            } else {
                left = mid; // 范围缩小到 (mid, right)
            }
        }
        return right;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,5,2,1]\n[3,10,21]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,4,5]\n[1]\n
// @lcpr case=end

 */

