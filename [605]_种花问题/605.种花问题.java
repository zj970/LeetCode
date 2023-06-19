/*
 * @lc app=leetcode.cn id=605 lang=java
 *
 * [605] 种花问题
 */

// @lc code=start
class Solution {
    /**
     * 将矩阵的两端补上一个0，这样保证第一个花与最后一个花在判断时统一处理就不需要特判了。

遍历整个数组，对于每个0判断它左右两侧是否为空位，如果是则将其设置为1，计数器加一。

如果计数器n等于给定数量，则表示能种入n朵花，返回true，反之则返回false
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n == 1;
        }
        int[] bed = new int[flowerbed.length + 2]; // 创建一个长度为原数组长度+2的数组
        System.arraycopy(flowerbed, 0, bed, 1, flowerbed.length); // 复制原数组到新数组的中间部分
        int count = 0;
        for (int i = 1; i < bed.length - 1; i++) {
            if (bed[i - 1] == 0 && bed[i] == 0 && bed[i + 1] == 0) {
                bed[i] = 1;
                count++;
                if (count == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end

