/*
 * @lc app=leetcode.cn id=383 lang=java
 * @lcpr version=21907
 *
 * [383] 赎金信
 */

// @lc code=start

/**字符统计
题目要求使用字符串 {magazine}magazine 中的字符来构建新的字符串 {ransomNote}ransomNote，
且{ransomNote}ransomNote 中的每个字符只能使用一次，
只需要满足字符串 {magazine}magazine 中的每个英文字母 ({'a'-'z'})(​′a′ − ′z′ ​) 的统计次数都大于等于 {ransomNote}ransomNote 中相同字母的统计次数即可。

如果字符串 {magazine}magazine 的长度小于字符串 {ransomNote}ransomNote 的长度，则我们可以肯定 {magazine}magazine 无法构成 {ransomNote}ransomNote，此时直接返回 {false}false。
首先统计 {magazine}magazine 中每个英文字母 aa 的次数 {cnt}[a]cnt[a]，再遍历统计 {ransomNote}ransomNote 中每个英文字母的次数，如果发现 {ransomNote}ransomNote 中存在某个英文字母 cc 的统计次数大于 {magazine}magazine 中该字母统计次数 {cnt}[c]cnt[c]，则此时我们直接返回 {false}false。
 * 
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
        {
            return false;
        }

        int[] cnt = new int[26];

        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        
        for(char c : ransomNote.toCharArray()){
            cnt[c - 'a']--;
            if(cnt[c-'a'] < 0){
                return false;
            }
        }

        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "a"\n"b"\n
// @lcpr case=end

// @lcpr case=start
// "aa"\n"ab"\n
// @lcpr case=end

// @lcpr case=start
// "aa"\n"aab"\n
// @lcpr case=end

 */

