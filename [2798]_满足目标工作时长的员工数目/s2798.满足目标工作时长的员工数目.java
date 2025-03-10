/*
 * @lc app=leetcode.cn id=2798 lang=java
 * @lcpr version=30204
 *
 * [2798] 满足目标工作时长的员工数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                ans++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,2,3,4]\n2\n
// @lcpr case=end

// @lcpr case=start
// [5,1,4,2,2]\n6\n
// @lcpr case=end

 */

