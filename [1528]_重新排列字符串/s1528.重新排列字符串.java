/*
 * @lc app=leetcode.cn id=1528 lang=java
 * @lcpr version=30111
 *
 * [1528] 重新排列字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];

        for (int i = 0; i < s.length(); ++i) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "codeleet"\n[4,5,6,7,0,2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n[0,1,2]\n
// @lcpr case=end

 */

