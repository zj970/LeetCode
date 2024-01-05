/*
 * @lc app=leetcode.cn id=1678 lang=java
 * @lcpr version=30113
 *
 * [1678] 设计 Goal 解析器
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < command.length(); i++){
            if (command.charAt(i) == 'G') {
                builder.append('G');
            }else if (command.charAt(i) == '(' 
                && i + 1 < command.length() 
                && command.charAt(i + 1) == ')') {
                builder.append('o');
                i++;
            }else{
                builder.append("al");
                i+=3;
            }
        }

        return builder.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "G()(al)"\n
// @lcpr case=end

// @lcpr case=start
// "G()()()()(al)"\n
// @lcpr case=end

// @lcpr case=start
// "(al)G(al)()()G"\n
// @lcpr case=end

 */

