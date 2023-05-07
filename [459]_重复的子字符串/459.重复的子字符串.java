/*
 * @lc app=leetcode.cn id=459 lang=java
 * @lcpr version=21907
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return kmp(s + s , s);
    }

    public boolean kmp(String query, String pattern){
        int n = query.length();
        int m = pattern.length();

        int[] fail = new int[m];
        Arrays.fill(fail, -1);

        for(int i = 1; i < m; ++i){
            int j = fail[i-1];
            while(j != -1 && pattern.charAt(j+1) !=  pattern.charAt(i)){
                j = fail[j];
            }
            if(pattern.charAt(j + 1) == pattern.charAt(i)){
                fail[i] = j+1;
            }
        }

        int match  = -1;

        for(int i = 1; i < n - 1; ++i){
            while(match != -1 && pattern.charAt(match + 1) != query.charAt(i)){
                match = fail[match];
            }

            if(pattern.charAt(match + 1) == query.charAt(i)){
                ++match;
                if(match == m-1){
                    return true;
                }
            }
        }

        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abab"\n
// @lcpr case=end

// @lcpr case=start
// "aba"\n
// @lcpr case=end

// @lcpr case=start
// "abcabcabcabc"\n
// @lcpr case=end

 */

