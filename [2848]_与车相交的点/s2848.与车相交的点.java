/*
 * @lc app=leetcode.cn id=2848 lang=java
 * @lcpr version=30204
 *
 * [2848] 与车相交的点
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        // 1. 求解两个点之间是否有交集
        // 1.1 有交集则合并集合点
        // 1.2 无集合点则存取
        // 使用差分数组
        int[] d = new int[102];
        for (List<Integer> num : nums) {
            int start = num.get(0), end = num.get(1);
            ++d[start];
            --d[end + 1];
        }

        int ans = 0, s = 0;
        for(int x : d) {
            s += x;
            if (s > 0) {
                ++ans;
            }
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[3,6],[1,5],[4,7]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,3],[5,8]]\n
// @lcpr case=end

 */

