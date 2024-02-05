/*
 * @lc app=leetcode.cn id=1859 lang=java
 * @lcpr version=30115
 *
 * [1859] 将句子排序
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");    //句子分解成单词
        String[] str1 = new String[10]; //存储排序之后的答案
        for(int i = 0; i < str.length; i++)     //将每个单词的最后一个数字当作下标存储到str1中，因为最后的答案不包含数字，所以要把数字去除
            str1[str[i].charAt(str[i].length() - 1) - '0'] = str[i].substring(0, str[i].length() - 1);
        String ans = "";    //最终连接成句子的答案
        for(int i = 1; i <= str.length; i++) {  //把单词连接成句子
            ans += str1[i];
            if(i != str.length)
                ans += " ";
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "is2 sentence4 This1 a3"\n
// @lcpr case=end

// @lcpr case=start
// "Myself2 Me1 I4 and3"\n
// @lcpr case=end

 */

