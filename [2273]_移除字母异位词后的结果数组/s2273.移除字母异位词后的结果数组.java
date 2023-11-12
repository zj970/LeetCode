/*
 * @lc app=leetcode.cn id=2273 lang=java
 * @lcpr version=30109
 *
 * [2273] 移除字母异位词后的结果数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<String>();
        String pre = "";
        for(String word : words)
        {
            char[] cs = word.toCharArray();
            Arrays.sort(cs);
            String s = String.valueOf(cs);

            if(!s.equals(pre))
            {
                result.add(word);
            }
            pre = s;
        }

        return result;

    }
}
// @lc code=end



/*
// @lcpr case=start
// ["abba","baba","bbaa","cd","cd"]\n
// @lcpr case=end

// @lcpr case=start
// ["a","b","c","d","e"]\n
// @lcpr case=end

 */

