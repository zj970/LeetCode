/*
 * @lc app=leetcode.cn id=2053 lang=java
 * @lcpr version=30204
 *
 * [2053] 数组中第 K 个独一无二的字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (String str : arr) {
            if (map.get(str) == 1) {
                k--;
                if (k == 0) {
                    return str;
                }
            }
        }
        return "";
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["d","b","c","b","c","a"]\n2\n
// @lcpr case=end

// @lcpr case=start
// ["aaa","aa","a"]\n1\n
// @lcpr case=end

// @lcpr case=start
// ["a","b","a"]\n3\n
// @lcpr case=end

 */

