/*
 * @lc app=leetcode.cn id=2744 lang=java
 * @lcpr version=30204
 *
 * [2744] 最大字符串配对数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        boolean[][] seen = new boolean[26][26];
        for (String s : words) {
            int x = s.charAt(0) - 'a';
            int y = s.charAt(1) - 'a';
            if (seen[y][x]) {
                ans++; // s 和 seen 中的 y+x 匹配
            } else {
                seen[x][y] = true;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["cd","ac","dc","ca","zz"]\n
// @lcpr case=end

// @lcpr case=start
// ["ab","ba","cc"]\n
// @lcpr case=end

// @lcpr case=start
// ["aa","ab"]\n
// @lcpr case=end

 */

