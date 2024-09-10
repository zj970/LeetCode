/*
 * @lc app=leetcode.cn id=2042 lang=java
 * @lcpr version=30204
 *
 * [2042] 检查句子中的数字是否递增
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean areNumbersAscending(String s) {
        int pre = 0;
        for (String str : s.split(" ")) {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                int cur = Integer.parseInt(str);
                if (cur <= pre) {
                    return false;
                }
                pre = cur;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1 box has 3 blue 4 red 6 green and 12 yellow marbles"\n
// @lcpr case=end

// @lcpr case=start
// "hello world 5 x 5"\n
// @lcpr case=end

// @lcpr case=start
// "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"\n
// @lcpr case=end

// @lcpr case=start
// "4 5 11 26"\n
// @lcpr case=end

 */

