/*
 * @lc app=leetcode.cn id=2586 lang=java
 * @lcpr version=30204
 *
 * [2586] 统计范围内的元音字符串数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))) {
                sum++;
            }
        }
        return sum;
    }

    private boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["are","amy","u"]\n0\n2\n
// @lcpr case=end

// @lcpr case=start
// ["hey","aeo","mu","ooo","artro"]\n1\n4\n
// @lcpr case=end

 */

