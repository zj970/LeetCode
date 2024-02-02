/*
 * @lc app=leetcode.cn id=1844 lang=java
 * @lcpr version=30114
 *
 * [1844] 将所有数字用字符替换
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        for (int i = 1; i < length; i += 2) {
            arr[i] = (char) (arr[i - 1] + (arr[i] - '0'));
        }
        return new String(arr);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "a1c1e1"\n
// @lcpr case=end

// @lcpr case=start
// "a1b2c3d4e"\n
// @lcpr case=end

 */

