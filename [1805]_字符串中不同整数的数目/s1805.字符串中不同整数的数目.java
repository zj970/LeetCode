/*
 * @lc app=leetcode.cn id=1805 lang=java
 * @lcpr version=30114
 *
 * [1805] 字符串中不同整数的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        for (String str : word.split("[a-z]+")) if (str.length() > 0) set.add(str.replaceAll("^0+",""));
        return set.size();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "a123bc34d8ef34"\n
// @lcpr case=end

// @lcpr case=start
// "leet1234code234"\n
// @lcpr case=end

// @lcpr case=start
// "a1b01c001"\n
// @lcpr case=end

 */

