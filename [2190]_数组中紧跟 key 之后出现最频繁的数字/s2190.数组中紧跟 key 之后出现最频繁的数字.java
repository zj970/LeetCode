/*
 * @lc app=leetcode.cn id=2190 lang=java
 * @lcpr version=30204
 *
 * [2190] 数组中紧跟 key 之后出现最频繁的数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> freq = new HashMap<>();
        int mostFreq = -1;
        for (int i = 0, n = nums.length, max = 0; i + 1 < n; ++i) {
            if (nums[i] == key) {
                int candidate = nums[i + 1];
                freq.put(candidate, 1 + freq.getOrDefault(candidate, 0));
                if (freq.get(candidate) > max) {
                    max = freq.get(candidate);
                    mostFreq = candidate;
                }
            }
        }
        return mostFreq;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,100,200,1,100]\n1\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2,2,3]\n2\n
// @lcpr case=end

 */

