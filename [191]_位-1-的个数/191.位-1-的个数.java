/*
 * @lc app=leetcode.cn id=191 lang=java
 * @lcpr version=21703
 *
 * [191] 位1的个数
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * // 00000000000000000000000000001011\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // 00000000000000000000000010000000\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // 11111111111111111111111111111101\n
 * // @lcpr case=end
 * 
 */
