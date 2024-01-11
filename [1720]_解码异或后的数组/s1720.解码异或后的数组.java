/*
 * @lc app=leetcode.cn id=1720 lang=java
 * @lcpr version=30113
 *
 * [1720] 解码异或后的数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] ans = new int[n];
        ans[0] = first;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] ^ encoded[i - 1];
        }
        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n1\n
// @lcpr case=end

// @lcpr case=start
// [6,2,7,3]\n4\n
// @lcpr case=end

 */

