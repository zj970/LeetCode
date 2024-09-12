/*
 * @lc app=leetcode.cn id=2068 lang=java
 * @lcpr version=30204
 *
 * [2068] 检查两个字符串是否几乎相等
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        int n = word1.length();
        for (int i = 0; i < n; i++) {
            char c1 = word1.charAt(i), c2 = word2.charAt(i);
            counts.put(c1, counts.getOrDefault(c1, 0) + 1);
            counts.put(c2, counts.getOrDefault(c2, 0) - 1);
        }
        Set<Map.Entry<Character, Integer>> entries = counts.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (Math.abs(entry.getValue()) > 3) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aaaa"\n"bccb"\n
// @lcpr case=end

// @lcpr case=start
// "abcdeef"\n"abaaacc"\n
// @lcpr case=end

// @lcpr case=start
// "cccddabba"\n"babababab"\n
// @lcpr case=end

 */

