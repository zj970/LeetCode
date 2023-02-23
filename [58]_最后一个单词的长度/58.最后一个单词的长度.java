/*
 * @lc app=leetcode.cn id=58 lang=java
 * @lcpr version=21704
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
/**
 * java 采取String转char数组，从末尾开始判断，分两种情况
 * 1. 末尾为空格
 * 2. 末尾不为空格
 * 循环判断，简单粗暴
 */
class Solution {
    public int lengthOfLastWord(String s) {
        char[] strings = s.toCharArray();
        int ret = 0;
        int sLength = strings.length - 1;

        if(strings[sLength] != '\u0020'){
            for (int i = sLength; i >= 0; i--) {
                if(strings[i] == '\u0020'){
                    return ret;
                }
                ret++;
            }
        } else{
            for (int i = sLength; i >= 0; i--) {
                if(strings[i] != '\u0020'){
                    ret++;
                    if(i-1>=0 && strings[i-1] == '\u0020'){
                        return ret;
                    }
                }
            }
        }
        return ret;
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
 * // "Hello World"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "   fly me   to   the moon  "\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "luffy is still joyboy"\n
 * // @lcpr case=end
 * 
 */
