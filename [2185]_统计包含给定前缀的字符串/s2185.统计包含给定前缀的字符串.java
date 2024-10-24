/*
 * @lc app=leetcode.cn id=2185 lang=java
 * @lcpr version=30204
 *
 * [2185] 统计包含给定前缀的字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                res++;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["pay","attention","practice","attend"]\n"at"\n
// @lcpr case=end

// @lcpr case=start
// ["leetcode","win","loops","success"]\n"code"\n
// @lcpr case=end

 */

