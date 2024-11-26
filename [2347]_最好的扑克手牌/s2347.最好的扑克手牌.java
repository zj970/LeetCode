/*
 * @lc app=leetcode.cn id=2347 lang=java
 * @lcpr version=30204
 *
 * [2347] 最好的扑克手牌
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Arrays.sort(ranks);
        Arrays.sort(suits);

        if (suits[0] == suits[4]) {
            return "Flush";
        } else if (ranks[0] == ranks[2] ||
                ranks[1] == ranks[3] ||
                ranks[2] == ranks[4]) {
            return "Three of a Kind";
        } else if (ranks[0] == ranks[1] ||
                ranks[1] == ranks[2] ||
                ranks[2] == ranks[3] ||
                ranks[3] == ranks[4]) {
            return "Pair";
        } else {
            return "High Card";
        }
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [13,2,3,1,9]\n["a","a","a","a","a"]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [4,4,2,4,4]\n["d","a","a","b","c"]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [10,10,2,12,9]\n["a","b","c","a","d"]\n
 * // @lcpr case=end
 * 
 */
