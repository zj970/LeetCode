/*
 * @lc app=leetcode.cn id=1880 lang=java
 * @lcpr version=30122
 *
 * [1880] 检查某单词是否等于两单词之和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstNum = getNum(firstWord), secondNum = getNum(secondWord), targetNum = getNum(targetWord);
        return firstNum + secondNum == targetNum;
    }

    public int getNum(String word) {
        int num = 0;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            int digit = word.charAt(i) - 'a';
            num = num * 10 + digit;
        }
        return num;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "acb"\n"cba"\n"cdb"\n
// @lcpr case=end

// @lcpr case=start
// "aaa"\n"a"\n"aab"\n
// @lcpr case=end

// @lcpr case=start
// "aaa"\n"a"\n"aaaa"\n
// @lcpr case=end

 */

