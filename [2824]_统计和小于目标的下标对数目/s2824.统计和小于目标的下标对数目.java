/*
 * @lc app=leetcode.cn id=2824 lang=java
 * @lcpr version=30204
 *
 * [2824] 统计和小于目标的下标对数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if ((nums.get(i) + nums.get(j)) < target) {
                    result++;
                }
            }
        }

        return result;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-1,1,2,3,1]\n2\n
// @lcpr case=end

// @lcpr case=start
// [-6,2,5,-2,-7,-1,3]\n-2\n
// @lcpr case=end

 */

