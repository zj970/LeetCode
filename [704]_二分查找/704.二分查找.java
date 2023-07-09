/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

/**
 * 在升序数组 nums\textit{nums}nums 中寻找目标值 target\textit{target}target，对于特定下标 iii，比较 nums[i]\textit{nums}[i]nums[i] 和 target\textit{target}target 的大小：

    如果 nums[i]=target\textit{nums}[i] = \textit{target}nums[i]=target，则下标 iii 即为要寻找的下标；

    如果 nums[i]>target\textit{nums}[i] > \textit{target}nums[i]>target，则 target\textit{target}target 只可能在下标 iii 的左侧；

    如果 nums[i]<target\textit{nums}[i] < \textit{target}nums[i]<target，则 target\textit{target}target 只可能在下标 iii 的右侧。
 */
// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
// @lc code=end

