/*
 * @lc app=leetcode.cn id=9 lang=java
 * @lcpr version=21505
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    int tmp = 10;

    public boolean isPalindrome(int x) {
        /**
         * 如果是负数说明不满足条件，直接返回false
         * 也不可能是10的倍数，但是0除外
         */
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        /**
         * 采取位反转的方法
         * 利用取余，相除得到反转后的数据
         * 判断两个数字是否相等
         */
        // int tmp = x;
        // int palind = 0;
        // while (tmp >= 1) {
        // palind = tmp % 10 + palind * 10;
        // tmp = tmp / 10;
        // }
        // return palind == x;
        return palindRomeInt(x) == x;
    }

    /**
     * 利用递归反转整数
     * @param x
     * @return
     */
    private int palindRomeInt(int x) {
        int resault = 0;
        if (x / 10 == 0) {
            return x;
        }
        resault = palindRomeInt(x / 10) + x % 10 * tmp;
        tmp *= 10;
        return resault;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * // 121\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // -121\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // 10\n
 * // @lcpr case=end
 * 
 */
