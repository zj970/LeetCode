/*
 * @lc app=leetcode.cn id=9 lang=java
 * @lcpr version=21505
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {

    public boolean isPalindrome(int x) {
        /**
         * 如果是负数说明不满足条件，直接返回false
         */
        if (x < 0) {
            return false;
        }
        /**
         * 采取位反转的方法
         * 利用取余，相除得到反转后的数据
         * 判断两个数字是否相等
         */
        int tmp = x;
        int palind = 0;
        while (tmp >= 1) {
            palind = tmp % 10 + palind * 10;
            tmp = tmp / 10;
        }
        return palind == x;
    }

    // public int palindRomeInt(int x){
    //     if (x >= 1){
    //         return x;
    //     }else{
    //         return palindRomeInt(x%10);
    //     }
    // }
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
