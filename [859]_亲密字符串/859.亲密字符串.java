/*
 * @lc app=leetcode.cn id=859 lang=java
 *
 * [859] 亲密字符串
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
	 // 两字符串相等的case
        if (s.equals(goal)) {
            int[] count = new int[26];  // 建立一个26个字母的索引
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;   // 对应字母频度统计
                if (count[s.charAt(i) - 'a'] > 1) {   // 如果有大于1的，就一定有重复字母，因为两字符串相等，所以换重复的就一定相等
                    return true;
                }
            }
            return false;
        } else {
	    // 两字符串不相等的情况
            int first = -1, second = -1; 
            for (int i = 0; i < goal.length(); i++) {  // 遍历字符串
                if (s.charAt(i) != goal.charAt(i)) {  // 判断有且仅有两个s和goal相同位置的字符不一样，一个first, 一个second
                    if (first == -1) 
                        first = i;   // 找到first
                    else if (second == -1)
                        second = i;   // 找到second
                    else
                        return false;   // 超过两个
                }
            }
           //second != -1 first也就不是-1了，满足有且仅有两个不同字符
           //s的first等于goal的second且s的second等于goal的first,互换可得相同字符串
            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first)); 
        }
    }
}
// @lc code=end

