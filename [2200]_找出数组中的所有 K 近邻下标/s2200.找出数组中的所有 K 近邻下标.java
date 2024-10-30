/*
 * @lc app=leetcode.cn id=2200 lang=java
 * @lcpr version=30204
 *
 * [2200] 找出数组中的所有 K 近邻下标
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> indices = new ArrayList<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int start = Math.max(i - k, 0), end = Math.min(i + k, n - 1);
            boolean found = false;
            for (int j = start; j <= end && !found; j++) {
                if (nums[j] == key) {
                    found = true;
                }
            }
            if (found) {
                indices.add(i);
            }
        }
        return indices;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,4,9,1,3,9,5]\n9\n1\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2,2,2]\n2\n2\n
// @lcpr case=end

 */

