/*
 * @lc app=leetcode.cn id=2451 lang=java
 * @lcpr version=30204
 *
 * [2451] 差值数组不同的字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String oddString(String[] words) {
        int m = words.length;
        int[] difference0 = getDifference(words[0]);
        int[] difference1 = getDifference(words[1]);
        if (Arrays.equals(difference0, difference1)) {
            for (int i = 2; i < m; i++) {
                int[] difference = getDifference(words[i]);
                if (!Arrays.equals(difference0, difference)) {
                    return words[i];
                }
            }
        }
        int[] difference2 = getDifference(words[2]);
        if (Arrays.equals(difference0, difference2)) {
            return words[1];
        } else {
            return words[0];
        }
    }

    public int[] getDifference(String word) {
        int n = word.length();
        int[] difference = new int[n - 1];
        for (int j = 0; j < n - 1; j++) {
            difference[j] = word.charAt(j + 1) - word.charAt(j);
        }
        return difference;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["adc","wzy","abc"]\n
// @lcpr case=end

// @lcpr case=start
// ["aaa","bob","ccc","ddd"]\n
// @lcpr case=end

 */

