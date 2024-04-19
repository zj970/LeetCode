/*
 * @lc app=leetcode.cn id=1897 lang=java
 * @lcpr version=30122
 *
 * [1897] 重新分配字符使所有字符串都相等
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean makeEqual(String[] words) {

        int wordsCount = words.length;
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        for (String word : words) {
            int wordLength = word.length();
            for (int i = 0; i < wordLength; i++) {
                char c = word.charAt(i);
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = counts.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() % wordsCount != 0) {
                return false;
            }
        }
        return true;

    }
}
// @lc code=end



/*
// @lcpr case=start
// ["abc","aabc","bc"]\n
// @lcpr case=end

// @lcpr case=start
// ["ab","a"]\n
// @lcpr case=end

 */

