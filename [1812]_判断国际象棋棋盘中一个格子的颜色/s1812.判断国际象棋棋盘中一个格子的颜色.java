/*
 * @lc app=leetcode.cn id=1812 lang=java
 * @lcpr version=30113
 *
 * [1812] 判断国际象棋棋盘中一个格子的颜色
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter = (coordinates.charAt(0) - 'a') % 2;     // a列:白色 b列:黑色 c列:白色 ……
        int number = (coordinates.charAt(1) - '1' + 1) % 2; // 1行:黑色 2行:白色 3行:黑色 ……
        return (letter ^ number) == 0; 
    }
}
// @lc code=end



/*
// @lcpr case=start
// "a1"\n
// @lcpr case=end

// @lcpr case=start
// "h3"\n
// @lcpr case=end

// @lcpr case=start
// "c7"\n
// @lcpr case=end

 */

