/*
 * @lc app=leetcode.cn id=657 lang=java
 *
 * [657] 机器人能否返回原点
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
public boolean judgeCircle(String moves) {
    int x = 0; // 记录当前横坐标
    int y = 0; // 记录当前纵坐标
    for (int i = 0; i < moves.length(); i++) {
        switch (moves.charAt(i)) { // 根据移动顺序更新坐标
            case 'U':
                y++;
                break;
            case 'D':
                y--;
                break;
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            default:
                break;
        }
    }
    return x == 0 && y == 0; // 判断最终位置是否为原点
    }
}
// @lc code=end

