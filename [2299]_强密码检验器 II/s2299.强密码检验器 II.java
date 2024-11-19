/*
 * @lc app=leetcode.cn id=2299 lang=java
 * @lcpr version=30204
 *
 * [2299] 强密码检验器 II
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        // 至少有 8 个字符
        if (password.length() < 8) {
            return false;
        }

        int mask = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (i > 0 && c == password.charAt(i - 1)) {
                return false;
            }

            // 至少包含 一个小写英文 字母
            if (Character.isLowerCase(c)) {
                mask |= 1;
            // 至少包含 一个大写英文 字母
            }else if (Character.isUpperCase(c)) {
                mask |= 2;
            // 至少包含 一个数字
            }else if (Character.isDigit(c)) {
                mask |= 4;
            // 至少包含 一个特殊字符 。特殊字符为："!@#$%^&*()-+" 中的一个
            }else {
                mask |= 8;
            }

        }
    
        return mask == 15;// 使用位运算代替Boolean

    }
}
// @lc code=end



/*
// @lcpr case=start
// "IloveLe3tcode!"\n
// @lcpr case=end

// @lcpr case=start
// "Me+You--IsMyDream"\n
// @lcpr case=end

// @lcpr case=start
// "1aB!"\n
// @lcpr case=end

 */

