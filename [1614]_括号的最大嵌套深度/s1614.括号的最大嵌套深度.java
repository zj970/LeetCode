/*
 * @lc app=leetcode.cn id=1614 lang=java
 * @lcpr version=30112
 *
 * [1614] 括号的最大嵌套深度
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int max = 0;
        for(char c : s.toCharArray())
        {
            if (c == '(') {
                depth++;
                max = Math.max(max, depth);
            }else if (c == ')') {
                depth--;
            }
        }
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "(1+(2*3)+((8)/4))+1"\n
// @lcpr case=end

// @lcpr case=start
// "(1)+((2))+(((3)))"\n
// @lcpr case=end

 */

