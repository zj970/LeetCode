/*
 * @lc app=leetcode.cn id=1684 lang=java
 * @lcpr version=30112
 *
 * [1684] 统计一致字符串的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0 ;
        for (String string : words) {
            int i = 0;
            for(;i < string.length(); i++){
                int j = 0;
                for (;j < allowed.length(); j++) {
                    if (string.charAt(i) == allowed.charAt(j)) {
                        break;
                    }
                }
                if (j >= allowed.length()) {
                    break;
                }
            }

            if (i == string.length()) {
                count++;
            }
        }

        return count;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "ab"\n["ad","bd","aaab","baa","badab"]\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n["a","b","c","ab","ac","bc","abc"]\n
// @lcpr case=end

// @lcpr case=start
// "cad"\n["cc","acd","b","ba","bac","bad","ac","d"]\n
// @lcpr case=end

 */

