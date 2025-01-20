/*
 * @lc app=leetcode.cn id=2696 lang=java
 * @lcpr version=30204
 *
 * [2696] 删除子串后的字符串最小长度
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minLength(String s) {
        List<Character> stack = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.add(c);
            int m = stack.size();
            if (m >= 2 &&
                (stack.get(m - 2) == 'A' && stack.get(m - 1) == 'B' ||
                stack.get(m - 2) == 'C' && stack.get(m - 1) == 'D')) {
                stack.remove(m - 1);
                stack.remove(m - 2);
            }
        }
        return stack.size();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "ABFCACDB"\n
// @lcpr case=end

// @lcpr case=start
// "ACBBD"\n
// @lcpr case=end

 */

