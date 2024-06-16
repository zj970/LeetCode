/*
 * @lc app=leetcode.cn id=1945 lang=java
 * @lcpr version=30203
 *
 * [1945] 字符串转化后的各位数字之和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int getLucky(String s, int k) {
        int lucky = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i) - 'a' + 1;
            while (temp > 0) {
                lucky += temp % 10;
                temp /= 10;
            }
            lucky += temp;
        }

        k -= 1;

        while (k > 0) {
            temp = lucky;
            lucky = 0;
            while (temp > 0) {
                lucky += temp % 10;
                temp /= 10;
            }
            k -= 1;
        }

        return lucky;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "iiii"\n1\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n2\n
// @lcpr case=end

 */

