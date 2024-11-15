/*
 * @lc app=leetcode.cn id=2278 lang=java
 * @lcpr version=30204
 *
 * [2278] 字母在字符串中的百分比
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        return (int) (count * 100.0 / s.length());

    }
}
// @lc code=end



/*
// @lcpr case=start
// "foobar"\n"o"\n
// @lcpr case=end

// @lcpr case=start
// "jjjj"\n"k"\n
// @lcpr case=end

 */

