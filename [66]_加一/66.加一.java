/*
 * @lc app=leetcode.cn id=66 lang=java
 * @lcpr version=21601
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i] += 1;
        for (; i > 0; i--) {
            if (i - 1 >= 0 && digits[i] >= 10) {
                digits[i - 1] += 1;
                digits[i] = 0;
            }
        }
        if (digits[0] == 10) {
            // 扩容
            int[] tmp = new int[digits.length + 1];
            tmp[0] = 1;
            tmp[1] = 0;
            for (int j = 2; j < tmp.length; j++) {
                tmp[j] = digits[j - 1];
            }
            return tmp;
        }

        return digits;
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
 * // [1,2,3]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [4,3,2,1]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [0]\n
 * // @lcpr case=end
 * 
 */
