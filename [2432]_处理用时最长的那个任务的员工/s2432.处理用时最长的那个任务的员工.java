/*
 * @lc app=leetcode.cn id=2432 lang=java
 * @lcpr version=30204
 *
 * [2432] 处理用时最长的那个任务的员工
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start


class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int hardest  = -1;
        int maxTime = 0;
        int prev = 0;
        for (int[] log : logs) {
            int id = log[0], leaveTime =log[1];
            int time = leaveTime - prev;
            if (time > maxTime || (time == maxTime && id < hardest)) {
                hardest = id;
                maxTime = time;
            }
            prev = leaveTime;
        }
        return hardest;
     }
}
// @lc code=end



/*
// @lcpr case=start
// 10\n[[0,3],[2,5],[0,9],[1,15]]\n
// @lcpr case=end

// @lcpr case=start
// 26\n[[1,1],[3,7],[2,12],[7,17]]\n
// @lcpr case=end

// @lcpr case=start
// 2\n[[0,10],[1,20]]\n
// @lcpr case=end

 */

