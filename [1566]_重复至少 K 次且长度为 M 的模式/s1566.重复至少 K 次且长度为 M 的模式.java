/*
 * @lc app=leetcode.cn id=1566 lang=java
 * @lcpr version=30112
 *
 * [1566] 重复至少 K 次且长度为 M 的模式
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    /**
     * 从i位置算，i+m位置开始应该出现k-1次。必须连续的k*m的子数组。
        每m个长度与从i到i+m-1比较是否一致。任何一个不一致都视作false。
     * @param arr
     * @param m
     * @param k
     * @return
     */
    public boolean containsPattern(int[] arr, int m, int k) {
        int len = arr.length;
		for (int l = 0; l <= len - m * k; l++) {
			int r = l + m;
			boolean ok = true;
			go: for (int i = 0; i < k - 1; i++) {
				for (int j = 0; j < m; j++) {
					if (arr[l + j] != arr[r + i * m + j]) {
						ok = false;
						break go;
					}
				}
			}
			if (ok) {
				return true;
			}
		}
		return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,4,4,4,4]\n1\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,1,2,1,1,1,3]\n2\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2,1,2,1,3]\n2\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,1,2]\n2\n2\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2,2]\n2\n3\n
// @lcpr case=end

 */

