/*
 * @lc app=leetcode.cn id=2748 lang=java
 * @lcpr version=30204
 *
 * [2748] 美丽下标对的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int res = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 10) {
                nums[i] /= 10;
            }
            for (int j = i + 1; j < n; j++) {
                if (gcd(nums[i], nums[j] % 10) == 1) {
                    res++;
                }
            }
        }

        return res;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,5,1,4]\n
// @lcpr case=end

// @lcpr case=start
// [11,21,12]\n
// @lcpr case=end

 */

