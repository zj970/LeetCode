/*
 * @lc app=leetcode.cn id=2423 lang=java
 * @lcpr version=30204
 *
 * [2423] 删除字符使频率相同
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean equalFrequency(String word) {
        int[] charCount = new int[26];
        int n  = word.length();
        for (int i = 0; i < n; i++) {
            charCount[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (charCount[i] == 0) {
                continue;
            }
            charCount[i]--;
            HashSet<Integer> frequency = new HashSet<Integer>();
            for (int f : charCount) {
                if (f > 0) {
                    frequency.add(f);
                }
            }
            if (frequency.size() == 1) {
                return true;
            }
            charCount[i]++;
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcc"\n
// @lcpr case=end

// @lcpr case=start
// "aazz"\n
// @lcpr case=end

 */

