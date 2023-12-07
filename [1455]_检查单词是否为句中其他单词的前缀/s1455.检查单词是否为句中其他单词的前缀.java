/*
 * @lc app=leetcode.cn id=1455 lang=java
 * @lcpr version=30111
 *
 * [1455] 检查单词是否为句中其他单词的前缀
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int n = searchWord.length();
        for(int i = 0; i < words.length; i++){
            if(words[i].length() < n) continue;
            if(searchWord.equals(words[i].substring(0,n))){
                return i + 1;
            }
        }
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "i love eating burger"\n"burg"\n
// @lcpr case=end

// @lcpr case=start
// "this problem is an easy problem"\n"pro"\n
// @lcpr case=end

// @lcpr case=start
// "i am tired"\n"you"\n
// @lcpr case=end

 */

