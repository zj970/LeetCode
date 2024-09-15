/*
 * @lc app=leetcode.cn id=2085 lang=java
 * @lcpr version=30204
 *
 * [2085] 统计出现过一次的公共字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countWords(String[] words1, String[] words2) {
 // 统计字符串出现频率
        Map<String, Integer> freq1 = new HashMap<>();
        Map<String, Integer> freq2 = new HashMap<>();
        for (String w : words1) {
            freq1.put(w, freq1.getOrDefault(w, 0) + 1);
        }
        for (String w : words2) {
            freq2.put(w, freq2.getOrDefault(w, 0) + 1);
        }

        // 遍历 words1 出现的字符并判断是否满足要求
        int res = 0;
        for (String w : freq1.keySet()) {
            if (freq1.get(w) == 1 && freq2.getOrDefault(w, 0) == 1) {
                res++;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["leetcode","is","amazing","as","is"]\n["amazing","leetcode","is"]\n
// @lcpr case=end

// @lcpr case=start
// ["b","bb","bbb"]\n["a","aa","aaa"]\n
// @lcpr case=end

// @lcpr case=start
// ["a","ab"]\n["a","a","a","ab"]\n
// @lcpr case=end

 */

