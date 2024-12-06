/*
 * @lc app=leetcode.cn id=2404 lang=java
 * @lcpr version=30204
 *
 * [2404] 出现最频繁的偶数元素
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int x : nums) {
            if (x % 2 == 0) {
                count.put(x, count.getOrDefault(x, 0) + 1);
            }
        }
        int res = -1, ct = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (res == -1 || entry.getValue() > ct || entry.getValue() == ct && res > entry.getKey()) {
                res = entry.getKey();
                ct = entry.getValue();
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,2,2,4,4,1]\n
// @lcpr case=end

// @lcpr case=start
// [4,4,4,9,2,4]\n
// @lcpr case=end

// @lcpr case=start
// [29,47,21,41,13,37,25,7]\n
// @lcpr case=end

 */

