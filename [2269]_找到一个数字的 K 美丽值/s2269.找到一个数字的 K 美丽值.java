/*
 * @lc app=leetcode.cn id=2269 lang=java
 * @lcpr version=30109
 *
 * [2269] 找到一个数字的 K 美丽值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int n = s.length(), cnt = 0;
        for (int i = 0; i + k <= n; i++) {
        int b = Integer.parseInt(s.substring(i, i + k));
        if (b != 0 && num % b == 0) cnt++;
        }
        return cnt;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 240\n2\n
// @lcpr case=end

// @lcpr case=start
// 430043\n2\n
// @lcpr case=end

 */

