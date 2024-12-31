/*
 * @lc app=leetcode.cn id=2605 lang=java
 * @lcpr version=30204
 *
 * [2605] 从两个数字数组里生成最小数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int mask1 = 0, mask2 = 0;
        for (int x : nums1) mask1 |= 1 << x;
        for (int x : nums2) mask2 |= 1 << x;
        int m = mask1 & mask2;
        if (m > 0) return Integer.numberOfTrailingZeros(m); // 有交集
        int x = Integer.numberOfTrailingZeros(mask1);
        int y = Integer.numberOfTrailingZeros(mask2);
        return Math.min(x * 10 + y, y * 10 + x);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,1,3]\n[5,7]\n
// @lcpr case=end

// @lcpr case=start
// [3,5,2,6]\n[3,1,7]\n
// @lcpr case=end

 */

