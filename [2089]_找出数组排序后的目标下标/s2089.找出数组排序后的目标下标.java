/*
 * @lc app=leetcode.cn id=2089 lang=java
 * @lcpr version=30204
 *
 * [2089] 找出数组排序后的目标下标
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,5,2,3]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2,5,2,3]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,5,2,3]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,2,5,2,3]\n4\n
// @lcpr case=end

 */

