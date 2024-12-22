/*
 * @lc app=leetcode.cn id=2506 lang=java
 * @lcpr version=30204
 *
 * [2506] 统计相似字符串对的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int similarPairs(String[] words) {
        int len = words.length;

        // 对每个字符提取特征
        int[] wordFeature = new int[len];
        for (int i = 0; i < len; i++) {
            for (char c : words[i].toCharArray()) {
                // 特征值使用int型32位，存储26字母各位，根据字母表索引对应位置1
                wordFeature[i] = wordFeature[i] | (1 << (c - 'a'));
            }
        }
        // 两两比较特征值是否相等并统计
        int cnt = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (wordFeature[i] == wordFeature[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["aba","aabb","abcd","bac","aabc"]\n
// @lcpr case=end

// @lcpr case=start
// ["aabb","ab","ba"]\n
// @lcpr case=end

// @lcpr case=start
// ["nba","cba","dba"]\n
// @lcpr case=end

 */

