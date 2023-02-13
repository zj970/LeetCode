/*
 * @lc app=leetcode.cn id=14 lang=java
 * @lcpr version=21505
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        if (strs.length == 1) {
            return strs[0];
        }
        int min = arrayForMin(strs);
        if (min == 0) {
            return result;
        }
        for (int i = 0; i < min; i++) {
            boolean isSame = true;
            for (int j = 0; j < strs.length; j++) {
                for (int k = 0; k < strs.length; k++) {
                    if (strs[j].charAt(i) != strs[k].charAt(i)) {
                        isSame = false;
                        break;
                    }
                }

                if (isSame) {
                    result += strs[j].charAt(i);
                    break;
                }
            }
            if (!isSame) {
                return result;
            }
        }
        return result;
    }

    public int arrayForMin(String[] strs) {
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minLength = minLength < strs[i].length() ? minLength : strs[i].length();
        }
        return minLength;
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
 * // ["flower","flow","flight"]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // ["dog","racecar","car"]\n
 * // @lcpr case=end
 * 
 */
