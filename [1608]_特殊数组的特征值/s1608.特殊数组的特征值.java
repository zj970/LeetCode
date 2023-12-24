/*
 * @lc app=leetcode.cn id=1608 lang=java
 * @lcpr version=30112
 *
 * [1608] 特殊数组的特征值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int x = 0; x < 1010; x++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (nums[mid] >= x) r = mid;
                else l = mid + 1;
            }
            if (nums[r] >= x && x == n - r) return x;
        }
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,5]\n
// @lcpr case=end

// @lcpr case=start
// [0,0]\n
// @lcpr case=end

// @lcpr case=start
// [0,4,3,0,4]\n
// @lcpr case=end

// @lcpr case=start
// [3,6,7,7,0]\n
// @lcpr case=end

 */

