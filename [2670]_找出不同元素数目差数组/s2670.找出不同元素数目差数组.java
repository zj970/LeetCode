/*
 * @lc app=leetcode.cn id=2670 lang=java
 * @lcpr version=30204
 *
 * [2670] 找出不同元素数目差数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Set;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] sufCnt = new int[n + 1];
        Set<Integer> set = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            set.add(nums[i]);
            sufCnt[i] = set.size();
        }
        int[] res = new int[n];
        set.clear();
        for (int i = 0; i < n; ++i) {
            set.add(nums[i]);
            res[i] = set.size() - sufCnt[i + 1];
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,3,4,2]\n
// @lcpr case=end

 */

