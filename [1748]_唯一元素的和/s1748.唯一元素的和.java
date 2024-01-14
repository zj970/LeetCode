/*
 * @lc app=leetcode.cn id=1748 lang=java
 * @lcpr version=30113
 *
 * [1748] 唯一元素的和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int sumOfUnique(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> state = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!state.containsKey(num)) {
                ans += num;
                state.put(num, 1);
            } else if (state.get(num) == 1) {
                ans -= num;
                state.put(num, 2);
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5]\n
// @lcpr case=end

 */

