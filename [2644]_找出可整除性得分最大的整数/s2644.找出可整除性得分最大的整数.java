/*
 * @lc app=leetcode.cn id=2644 lang=java
 * @lcpr version=30204
 *
 * [2644] 找出可整除性得分最大的整数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int cnt = -1, ans = 0;
        for (int i = 0; i < divisors.length; i++) {
            int tmp = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0) {
                    tmp++;
                }
            }

            if (tmp > cnt || (tmp == cnt && divisors[i] < ans)) {
                cnt = tmp;
                ans = divisors[i];
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,9,15,50]\n[5,3,7,2]\n
// @lcpr case=end

// @lcpr case=start
// [4,7,9,3,9]\n[5,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [20,14,21,10]\n[10,16,20]\n
// @lcpr case=end

 */

