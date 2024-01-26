/*
 * @lc app=leetcode.cn id=1790 lang=java
 * @lcpr version=30113
 *
 * [1790] 仅执行一次字符串交换能否使两个字符串相等
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length(), a = -1, b = -1;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) continue;
            if (a == -1) a = i;
            else if (b == -1) b = i;
            else return false;
        }
        if (a == -1) return true;
        if (b == -1) return false;
        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// "bank"\n"kanb"\n
// @lcpr case=end

// @lcpr case=start
// "attack"\n"defend"\n
// @lcpr case=end

// @lcpr case=start
// "kelb"\n"kelb"\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n"dcba"\n
// @lcpr case=end

 */

