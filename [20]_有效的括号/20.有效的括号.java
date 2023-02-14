/*
 * @lc app=leetcode.cn id=20 lang=java
 * @lcpr version=21505
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
   /*
        数组模拟栈:
        1.当为左括号类型时候，当前字符入栈
        2.当为右括号类型时，如果栈顶恰好是与之对应左括号，左括号一起出栈；否则返回false
        3.最后看栈是否为空即可
         */
        int n = s.length();
        int[] stack = new int[n];
        int idx = -1;   // 栈顶索引
        HashMap<Character, Character> map = new HashMap<>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                stack[++idx] = c;
            } else {
                if (idx != -1 && stack[idx] == map.get(c)) {
                    --idx;
                } else {
                    return false;
                }
            }
        }
        return idx == -1;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// "()"\n
// @lcpr case=end

// @lcpr case=start
// "()[]{}"\n
// @lcpr case=end

// @lcpr case=start
// "(]"\n
// @lcpr case=end

 */


