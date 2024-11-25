/*
 * @lc app=leetcode.cn id=2341 lang=java
 * @lcpr version=30204
 *
 * [2341] 数组能形成多少数对
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];
        for (int x : nums) {
            ++cnt[x];
        }
        int s = 0;
        for (int v : cnt) {
            s += v / 2;
        }
        return new int[] {s, nums.length - s * 2};
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,2,1,3,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,1]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

