/*
 * @lc app=leetcode.cn id=2660 lang=java
 * @lcpr version=30204
 *
 * [2660] 保龄球游戏的获胜者
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        // n == player1.length == player2.length
        // 0 <= player1[i], player2[i] <= 10
        int score1 = 0, score2 = 0, count = 0;
        for (int i = 0; i < player1.length; i++) {

            if (count > 0) {
                score1 += 2 * player1[i];
                count--;
            } else {
                score1 += player1[i];
            }

            if (player1[i] == 10) {
                count = 2;
            }

        }

        count = 0;
        for (int i = 0; i < player2.length; i++) {

            if (count > 0) {
                score2 += 2 * player2[i];
                count--;
            } else {
                score2 += player2[i];
            }

            if (player2[i] == 10) {
                count = 2;
            }

        }

        return score1 > score2 ? 1: (score1 < score2 ? 2: 0);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,10,3,2]\n[6,5,7,3]\n
// @lcpr case=end

// @lcpr case=start
// [3,5,7,6]\n[8,10,10,2]\n
// @lcpr case=end

// @lcpr case=start
// [2,3]\n[4,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,10,10,10,10]\n[10,10,10,10,1,1,1]\n
// @lcpr case=end

 */

