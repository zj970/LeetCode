/*
 * @lc app=leetcode.cn id=2515 lang=java
 * @lcpr version=30204
 *
 * [2515] 到目标字符串的最短距离
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int min = Integer.MAX_VALUE;
        int len = words.length;
        for (int i = startIndex; i < len + startIndex; i++) {
            if (words[i%len].equals(target)) {
                int rmin = i - startIndex;
                int lmin = len + startIndex - i;
                min = Math.min(min, Math.min(rmin, lmin));
            }
        }
        return min == Integer.MAX_VALUE ? -1:min;
            
    }

}
// @lc code=end



/*
// @lcpr case=start
// ["hello","i","am","leetcode","hello"]\n"hello"\n1\n
// @lcpr case=end

// @lcpr case=start
// ["a","b","leetcode"]\n"leetcode"\n0\n
// @lcpr case=end

// @lcpr case=start
// ["i","eat","leetcode"]\n"ate"\n0\n
// @lcpr case=end

 */

