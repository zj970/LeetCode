/*
 * @lc app=leetcode.cn id=2283 lang=java
 * @lcpr version=30204
 *
 * [2283] 判断一个数的数字计数是否等于数位的值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        int[] cnt = new int[10];
        for (int i = 0; i < n; i++) {
            cnt[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < n; i++) {
            if (cnt[i] != num.charAt(i) - '0') {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1210"\n
// @lcpr case=end

// @lcpr case=start
// "030"\n
// @lcpr case=end

 */

