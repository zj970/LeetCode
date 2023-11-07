/*
 * @lc app=leetcode.cn id=1957 lang=java
 * @lcpr version=30105
 *
 * [1957] 删除字符使字符串变好
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String makeFancyString(String s) {
        if(s.length() < 3)
        {
            return s;
        }

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            if( i+1 < s.length() && s.charAt(i+1) == s.charAt(i)){
                if( i+2 < s.length() && s.charAt(i+2) == s.charAt(i+1)){
                    continue;
                }
            }
            builder.append(s.charAt(i));
        }

        return builder.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "leeetcode"\n
// @lcpr case=end

// @lcpr case=start
// "aaabaaaa"\n
// @lcpr case=end

// @lcpr case=start
// "aab"\n
// @lcpr case=end

 */

