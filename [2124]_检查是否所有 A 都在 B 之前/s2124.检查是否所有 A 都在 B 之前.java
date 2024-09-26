/*
 * @lc app=leetcode.cn id=2124 lang=java
 * @lcpr version=30204
 *
 * [2124] 检查是否所有 A 都在 B 之前
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean checkString(String s) {
        int flag = 0;
        for (char c : s.toCharArray()) {
            //出现'b',往后遍历的时候但凡出现'a'就说明不符合条件,这里将flag置为1
            if (c == 'b')
                flag = 1;
            //当前字符为'a'且之前出现'b'(flag为1)则返回false
            if (c == 'a' && flag == 1)
                return false;
        }
        //全部遍历完,返回true
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aaabbb"\n
// @lcpr case=end

// @lcpr case=start
// "abab"\n
// @lcpr case=end

// @lcpr case=start
// "bbb"\n
// @lcpr case=end

 */

