/*
 * @lc app=leetcode.cn id=1450 lang=java
 * @lcpr version=30111
 *
 * [1450] 在既定时间做作业的学生人数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                ++ans;
            }
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n[3,2,7]\n4\n
// @lcpr case=end

// @lcpr case=start
// [4]\n[4]\n4\n
// @lcpr case=end

// @lcpr case=start
// [4]\n[4]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1]\n[1,3,2,4]\n7\n
// @lcpr case=end

// @lcpr case=start
// [9,8,7,6,5,4,3,2,1]\n[10,10,10,10,10,10,10,10,10]\n5\n
// @lcpr case=end

 */

