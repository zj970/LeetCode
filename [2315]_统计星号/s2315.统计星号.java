/*
 * @lc app=leetcode.cn id=2315 lang=java
 * @lcpr version=30204
 *
 * [2315] 统计星号
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countAsterisks(String s) {
        int count = 0, flags = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && flags % 2 == 0) {
                count ++;
            }
            if (s.charAt(i) == '|') {
                flags++;
            }
        }

        return count;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "l|*e*et|c**o|*de|"\n
// @lcpr case=end

// @lcpr case=start
// "iamprogrammer"\n
// @lcpr case=end

// @lcpr case=start
// "yo|uar|e**|b|e***au|tifu|l"\n
// @lcpr case=end

 */

