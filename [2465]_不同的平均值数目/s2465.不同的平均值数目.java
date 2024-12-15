/*
 * @lc app=leetcode.cn id=2465 lang=java
 * @lcpr version=30204
 *
 * [2465] 不同的平均值数目
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int distinctAverages(int[] nums) {
        Map<Integer, Integer> rsMap = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            if(!rsMap.containsKey(nums[i] + nums[nums.length - 1 - i])) {
                rsMap.put(nums[i]+nums[nums.length - i -1], 1);
            }
        }
        return rsMap.size();
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [4,1,4,0,3,5]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1,100]\n
 * // @lcpr case=end
 * 
 */
