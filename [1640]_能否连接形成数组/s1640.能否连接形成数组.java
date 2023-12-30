/*
 * @lc app=leetcode.cn id=1640 lang=java
 * @lcpr version=30112
 *
 * [1640] 能否连接形成数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int n = arr.length, m = pieces.length;
        Arrays.sort(pieces, (a,b)->a[0]-b[0]);
        for (int i = 0; i < n; ) {
            int l = 0, r = m - 1;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (pieces[mid][0] <= arr[i]) l = mid;
                else r = mid - 1;
            }
            int len = pieces[r].length, idx = 0;
            while (idx < len && pieces[r][idx] == arr[i + idx]) idx++;
            if (idx == len) i += len;
            else return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [15,88]\n[[88],[15]]\n
// @lcpr case=end

// @lcpr case=start
// [49,18,16]\n[[16,18,49]]\n
// @lcpr case=end

// @lcpr case=start
// [91,4,64,78]\n[[78],[4,64],[91]]\n
// @lcpr case=end

 */

