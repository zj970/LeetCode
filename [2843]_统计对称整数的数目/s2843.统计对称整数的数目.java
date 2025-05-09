/*
 * @lc app=leetcode.cn id=2843 lang=java
 * @lcpr version=30204
 *
 * [2843] 统计对称整数的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            char[] s = Integer.toString(i).toCharArray();
            int n = s.length;
            if (n % 2 > 0) {
                continue;
            }

            int diff = 0;
            for (int j = 0; j < n / 2; j++) {
                diff += s[j];
            }
            for (int j = n / 2 ; j < n; j++) {
                diff -= s[j];
            }

            if (diff == 0) {
                ans++;
            }
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1\n100\n
// @lcpr case=end

// @lcpr case=start
// 1200\n1230\n
// @lcpr case=end

 */

