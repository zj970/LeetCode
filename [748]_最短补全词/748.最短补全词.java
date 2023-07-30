/*
 * @lc app=leetcode.cn id=748 lang=java
 *
 * [748] 最短补全词
 */

// @lc code=start
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] cases = new int[26];
        //对 licensePlate 中出现的字母进行计数
        for(int i = 0; i < licensePlate.length(); i++) {
            if (Character.isLetter(licensePlate.charAt(i))) {
                cases[Character.toLowerCase(licensePlate.charAt(i)) - 'a']++;
            }
        }
        //用于记录最终结果的 word 的下标索引
        int resultId = -1;
        for (int i = 0; i < words.length; i++) {
            int[] oneWordCases = new int[26];
            //对 words 中的每个单词中出现的字母进行计数
            for(int j = 0; j < words[i].length(); j++) {
                if (Character.isLetter(words[i].charAt(j))) {
                    oneWordCases[Character.toLowerCase(words[i].charAt(j)) - 'a']++;
                }
            }

            //遍历两个cases数组，直到找到符合题目的 word
            //要求：licensePlate 中出现的单词均要在 word 中，且出现的次数只能多不能少
            boolean ok = true;
            for (int k = 0; k < 26; k++) {
                if (oneWordCases[k] < cases[k]) {
                    ok = false;
                    break;
                }
            }

            //如果找到符合题目的 word 就与之前的候选结果比较优劣
            //索引较小且单词长度最短者优先
            if (ok && (resultId < 0 || words[resultId].length() > words[i].length())) {
                resultId = i;
            }

        }
        return words[resultId];
    }
}
// @lc code=end

