/*
 * @lc app=leetcode.cn id=1078 lang=java
 *
 * [1078] Bigram 分词
 */

// @lc code=start
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] textArray = text.split(" ");
        String result = "";

        for(int i = 0; i + 2 < textArray.length; i++)
        {
            if(first.equals(textArray[i]) && second.equals(textArray[i+1]))
            {
                result = result + textArray[i+2] + " ";
            }
        }
        if(result.isEmpty())
        {
            return new String[0];
        }

        return result.split(" ");
    }
}
// @lc code=end

