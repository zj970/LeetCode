/*
 * @lc app=leetcode.cn id=1662 lang=java
 * @lcpr version=30112
 *
 * [1662] 检查两个字符串数组是否相等
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder1 = new StringBuilder();        
        StringBuilder builder2 = new StringBuilder();

        for(String s : word1)
        {
            builder1.append(s);
        }

        for(String s : word2){
            builder2.append(s);
        }
        return builder1.toString().equals(builder2.toString());

    }
}
// @lc code=end



/*
// @lcpr case=start
// ["ab", "c"]\n["a", "bc"]\n
// @lcpr case=end

// @lcpr case=start
// ["a", "cb"]\n["ab", "c"]\n
// @lcpr case=end

// @lcpr case=start
// ["abc", "d", "defg"]\n["abcddefg"]\n
// @lcpr case=end

 */

