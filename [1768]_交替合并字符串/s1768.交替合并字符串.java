/*
 * @lc app=leetcode.cn id=1768 lang=java
 * @lcpr version=30113
 *
 * [1768] 交替合并字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length(), w2 = word2.length(), index = 0;
        char[] result = new char[w1 + w2];
        for (int i = 0; i < w1 || i < w2; i++) {
            if (i < w1) result[index++] = word1.charAt(i);
            if (i < w2) result[index++] = word2.charAt(i);
        }
        return new String(result);

    }
}
// @lc code=end



/*
// @lcpr case=start
// "abc"\n"pqr"\n
// @lcpr case=end

// @lcpr case=start
// "ab"\n"pqrs"\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n"pq"\n
// @lcpr case=end

 */

