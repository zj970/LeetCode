/*
 * @lc app=leetcode.cn id=1275 lang=java
 * @lcpr version=30109
 *
 * [1275] 找出井字棋的获胜者
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    static final int SIDE = 3;
    static final String[] PLAYERS = {"A", "B"};
    public String tictactoe(int[][] moves) {
        int[][] countRows = new int[2][SIDE];
        int[][] countCols = new int[2][SIDE];
        int[][] countDiagonals = new int[2][2];
        int length = moves.length;
        for (int i = 0; i < length; i++) {
            int player = i % 2;
            int[] move = moves[i];
            int row = move[0], col = move[1];
            countRows[player][row]++;
            int countRow = countRows[player][row];
            if (countRow == SIDE) {
                return PLAYERS[player];
            }
            countCols[player][col]++;
            int countColumn = countCols[player][col];
            if (countColumn == SIDE) {
                return PLAYERS[player];
            }
            if (row == col) {
                countDiagonals[player][0]++;
                int countDiagonal = countDiagonals[player][0];
                if (countDiagonal == SIDE) {
                    return PLAYERS[player];
                }
            }
            if (row + col == SIDE - 1) {
                countDiagonals[player][1]++;
                int countDiagonal = countDiagonals[player][1];
                if (countDiagonal == SIDE) {
                    return PLAYERS[player];
                }
            }
        }
        return length == 9 ? "Draw" : "Pending";
    }
}

// @lc code=end



/*
// @lcpr case=start
// [[0,0],[2,0],[1,1],[2,1],[2,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0],[1,1]]\n
// @lcpr case=end

 */

