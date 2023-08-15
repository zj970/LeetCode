/*
 * @lc app=leetcode.cn id=836 lang=java
 *
 * [836] 矩形重叠
 */
/**
 * 如果两个矩形重叠，那么它们重叠的区域一定也是一个矩形，
 * 那么这代表了两个矩形与 xxx 轴平行的边（水平边）投影到 x 轴上时会有交集，
 * 与 y 轴平行的边（竖直边）投影到 y 轴上时也会有交集
 */
// @lc code=start
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) &&
                        Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]));
    }
}
// @lc code=end

