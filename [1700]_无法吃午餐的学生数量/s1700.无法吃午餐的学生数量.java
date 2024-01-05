/*
 * @lc app=leetcode.cn id=1700 lang=java
 * @lcpr version=30113
 *
 * [1700] 无法吃午餐的学生数量
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       int[] cnts = new int[2];
        for (int x : students) cnts[x]++;
        for (int i = 0; i < sandwiches.length; i++) {
            if (--cnts[sandwiches[i]] == -1) return sandwiches.length - i;
        }
        return 0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,0,0]\n[0,1,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,0,0,1]\n[1,0,0,0,1,1]\n
// @lcpr case=end

 */

