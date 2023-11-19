/*
 * @lc app=leetcode.cn id=1317 lang=java
 * @lcpr version=30110
 *
 * [1317] 将整数转换为两个无零整数的和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = n < 10 ? 1 : 0;
        int digit = 1;
        int x = n;
        while (x > 0) {
            if (x < 10) {
                break;
            }
            int delta = x % 10 != 1 ? 1 : 2;
            a += delta * digit;
            x -= delta;
            x /= 10;
            digit *= 10;
        }
        return new int[]{a, n - a};
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 11\n
// @lcpr case=end

// @lcpr case=start
// 10000\n
// @lcpr case=end

// @lcpr case=start
// 69\n
// @lcpr case=end

// @lcpr case=start
// 1010\n
// @lcpr case=end

 */

