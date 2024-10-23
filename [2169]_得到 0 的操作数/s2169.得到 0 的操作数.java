/*
 * @lc app=leetcode.cn id=2169 lang=java
 * @lcpr version=30204
 *
 * [2169] 得到 0 的操作数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 < num2) {
                count += num2 / num1;
                num2 = num2 % num1;
            } else {
                count += num1 / num2;
                num1 = num1 % num2;
            }
        }
        return count;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n3\n
// @lcpr case=end

// @lcpr case=start
// 10\n10\n
// @lcpr case=end

 */

