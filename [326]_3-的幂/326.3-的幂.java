/*
 * @lc app=leetcode.cn id=326 lang=java
 * @lcpr version=21801
 *
 * [326] 3 的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        while (n%3 == 0 && n!=0) {
            n /= 3;
        }
        return n == 1;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// 27\n
// @lcpr case=end

// @lcpr case=start
// 0\n
// @lcpr case=end

// @lcpr case=start
// 9\n
// @lcpr case=end

// @lcpr case=start
// 45\n
// @lcpr case=end

 */


