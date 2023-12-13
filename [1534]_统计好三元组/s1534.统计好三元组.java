/*
 * @lc app=leetcode.cn id=1534 lang=java
 * @lcpr version=30111
 *
 * [1534] 统计好三元组
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0;

        for (int i = 0; i < arr.length - 2; ++i) {
            for (int j = i + 1; j < arr.length - 1; ++j) {
                for (int k = j + 1; k < arr.length; ++k) {
                    if (Math.abs(arr[i] - arr[j]) <= a
                            && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[k] - arr[i]) <= c) {
                        ++res;
                    }
                }
            }
        }
        return res;

    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [3,0,1,1,9,7]\n7\n2\n3\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1,1,2,2,3]\n0\n0\n1\n
 * // @lcpr case=end
 * 
 */
