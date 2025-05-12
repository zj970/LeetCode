/*
 * @lc app=leetcode.cn id=2833 lang=java
 * @lcpr version=30204
 *
 * [2833] 距离原点最远的点
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int result = 0, buffest = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                result--;
            } else if (moves.charAt(i) == 'R') {
                result++;
            } else {
                buffest++;
            }
        }

        return result >= 0 ? result + buffest : buffest - result;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "L_RL__R"\n
// @lcpr case=end

// @lcpr case=start
// "_R__LL_"\n
// @lcpr case=end

// @lcpr case=start
// "_______"\n
// @lcpr case=end

 */

