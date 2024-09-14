/*
 * @lc app=leetcode.cn id=2062 lang=java
 * @lcpr version=30204
 *
 * [2062] 统计字符串中的元音子字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countVowelSubstrings(String word) {
        int n = word.length(), ans = 0;
        int vowel = 1 | 1 << 4 | 1 << 8 | 1 << 14 | 1 << 20;// 五个元音的状态
        for (int i = 0; i < n; ++i) {
            int mask = 0;
            for (int j = i; j < n; ++j) {
                char ch = word.charAt(j);
                if ((vowel & 1 << ch - 'a') == 0) break;// 碰到非元音
                mask |= 1 << ch - 'a';
                if (mask == vowel) ++ans;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aeiouu"\n
// @lcpr case=end

// @lcpr case=start
// "unicornarihan"\n
// @lcpr case=end

// @lcpr case=start
// "cuaieuouac"\n
// @lcpr case=end

// @lcpr case=start
// "bbaeixoubb"\n
// @lcpr case=end

 */

