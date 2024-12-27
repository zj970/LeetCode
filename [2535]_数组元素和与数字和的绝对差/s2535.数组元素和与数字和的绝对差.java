/*
 * @lc app=leetcode.cn id=2535 lang=java
 * @lcpr version=30204
 *
 * [2535] 数组元素和与数字和的绝对差
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int differenceOfSum(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            ans += x; // 累加元素和
            while (x > 0) {
                ans -= x % 10; // 减去数位和
                x /= 10;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,15,6,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

 */

