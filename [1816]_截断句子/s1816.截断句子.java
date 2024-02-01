/*
 * @lc app=leetcode.cn id=1816 lang=java
 * @lcpr version=30114
 *
 * [1816] 截断句子
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        int end = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (i == n || s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    end = i;
                    break;
                }
            }
        }
        return s.substring(0, end);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "Hello how are you Contestant"\n4\n
// @lcpr case=end

// @lcpr case=start
// "What is the solution to this problem"\n4\n
// @lcpr case=end

// @lcpr case=start
// "chopper is not a tanuki"\n5\n
// @lcpr case=end

 */

