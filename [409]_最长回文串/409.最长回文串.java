/*
 * @lc app=leetcode.cn id=409 lang=java
 * @lcpr version=21907
 *
 * [409] 最长回文串
 */
/**
 * 
 * 给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。

在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。

1 <= s.length <= 2000
s 只由小写 和/或 大写英文字母组成
 */
// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for(int i = 0; i<length;++i){
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0 ;
        for (int v: count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "abccccdd"\n
// @lcpr case=end

// @lcpr case=start
// "a"\n
// @lcpr case=end

// @lcpr case=start
// "aaaaaccc"\n
// @lcpr case=end

 */

