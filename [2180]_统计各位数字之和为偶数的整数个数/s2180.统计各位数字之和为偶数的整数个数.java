/*
 * @lc app=leetcode.cn id=2180 lang=java
 * @lcpr version=30204
 *
 * [2180] 统计各位数字之和为偶数的整数个数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countEven(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int n = i;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 30\n
// @lcpr case=end

 */

