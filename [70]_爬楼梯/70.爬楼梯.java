/*
 * @lc app=leetcode.cn id=70 lang=java
 * @lcpr version=21703
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n / 2 == 0) {
            return 0;
        }
        // 用排列组合去做
        int target = n / 2;
        if (n % 2 == 0) {
            int stairs = 1;
            for (int i = 1; i < target + 1; i++) {
                for(int j = n-i; j>0;j--){
                    stairs *=(n-j);
                    stairs /=(j);
                }
                return stairs;
            }
        }
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
 * // 2\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // 3\n
 * // @lcpr case=end
 * 
 */
