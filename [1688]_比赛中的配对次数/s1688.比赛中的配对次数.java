/*
 * @lc app=leetcode.cn id=1688 lang=java
 * @lcpr version=30113
 *
 * [1688] 比赛中的配对次数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numberOfMatches(int n) {
        int sum = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                sum += n;
            }else{
                sum = sum + (n - 1)/2;
                n = (n - 1)/2 + 1;
            }
        }

        return sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n
// @lcpr case=end

// @lcpr case=start
// 14\n
// @lcpr case=end

 */

