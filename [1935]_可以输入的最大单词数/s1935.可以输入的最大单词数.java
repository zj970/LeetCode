/*
 * @lc app=leetcode.cn id=1935 lang=java
 * @lcpr version=30104
 *
 * [1935] 可以输入的最大单词数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str = text.split(" ");
        char[] chars = brokenLetters.toCharArray();
        int length = chars.length;
        int result = 0;
        boolean flag = false;

        for(int i = 0; i < str.length; i++)
        {
            for(int j = 0; j < str[i].length(); j++)
            {
                for(int z = 0; z < length; z++)
                {
                    if(chars[z] == str[i].charAt(j))
                    {
                        flag = true;
                        break;
                    }
                }

                if(flag)
                {
                    break;
                }
            }
            if(flag)
            {
                flag = false;
            }else{
                result ++;
            }
        }

        return result;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "hello world"\n"ad"\n
// @lcpr case=end

// @lcpr case=start
// "leet code"\n"lt"\n
// @lcpr case=end

// @lcpr case=start
// "leet code"\n"e"\n
// @lcpr case=end

 */

