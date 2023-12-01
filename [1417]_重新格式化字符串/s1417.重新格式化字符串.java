/*
 * @lc app=leetcode.cn id=1417 lang=java
 * @lcpr version=30111
 *
 * [1417] 重新格式化字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String reformat(String s) {
        int sumDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sumDigit++;
            }
        }
        int sumAlpha = s.length() - sumDigit;
        if (Math.abs(sumDigit - sumAlpha) > 1) {
            return "";
        }
        boolean flag = sumDigit > sumAlpha;
        char[] arr = s.toCharArray();
        for (int i = 0, j = 1; i < s.length(); i += 2) {
            if (Character.isDigit(arr[i]) != flag) {
                while (Character.isDigit(arr[j]) != flag) {
                    j += 2;
                }
                swap(arr, i, j);
            }
        }
        return new String(arr);
    }

    public void swap(char[] arr, int i, int j) {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "a0b1c2"\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n
// @lcpr case=end

// @lcpr case=start
// "1229857369"\n
// @lcpr case=end

// @lcpr case=start
// "covid2019"\n
// @lcpr case=end

// @lcpr case=start
// "ab123"\n
// @lcpr case=end

 */

