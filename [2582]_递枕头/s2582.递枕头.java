/*
 * @lc app=leetcode.cn id=2582 lang=java
 * @lcpr version=30204
 *
 * [2582] 递枕头
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int passThePillow(int n, int time) {
        
        if (n > time) {
            return time + 1;
        }

        if (n - 1 == 0) {
            return 1;
        }

        int num = time / (n - 1);
        int index = time % (n - 1);

        return num % 2 == 0 ? index + 1: n - index;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n5\n
// @lcpr case=end

// @lcpr case=start
// 3\n2\n
// @lcpr case=end

 */

