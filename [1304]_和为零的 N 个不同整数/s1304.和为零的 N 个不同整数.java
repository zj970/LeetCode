/*
 * @lc app=leetcode.cn id=1304 lang=java
 * @lcpr version=30109
 *
 * [1304] 和为零的 N 个不同整数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;

        for(int i = 1; i <= n/2; i++){
            ans[index++] = -i;
            ans[index++] = i;
        }

        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */

