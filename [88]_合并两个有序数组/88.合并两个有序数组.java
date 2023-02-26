/*
 * @lc app=leetcode.cn id=88 lang=java
 * @lcpr version=21705
 *
 * [88] 合并两个有序数组
 */
/**
 * tip:
 *
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 * 进阶：你可以设计实现一个时间复杂度为 O(m + n) 的算法解决此问题吗？
 */
// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] retNums = new int[m+n];
        // for (int i = m+n -1; i > 0; i--) {
        // //以空间换时间
        // //3种情况
        // //1. n==m
        // //2. n>m
        // //3. m<n
        // //核心判断就是nums[--n-1] > nums[--m-1] ? retnums[i] = nums[--n-1]
        // //123000,256
        // //123056
        // if(m>1 && retNums[m-1] > nums2[n-1]){
        // nums1[i] = retNums[m-1];
        // //退位
        // m = m-1;
        // }else if ( n > 1 && nums2[n-1]>=retNums[m-1]){
        // nums1[i] = nums2[n-1];
        // //退位
        // n = n-1;
        // }
        // }
        // nums1 = retNums;

        // 暴力解法。先赋值后排序 
        /**
         * Your runtime beats 32.66 % of java submissions
         * Your memory usage beats 45.48 % of java submissions (41.5 MB) 
         * 耗时 0:37:7 */
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        // 排序 是否还可以调优
        for (int i = 0; i < m + n; i++) {
            for (int j = 0; j < m + n; j++) {
                if(nums1[i]<nums1[j]){
                    int a = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = a;
                }
            }
        }
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * // [1,2,3,0,0,0]\n3\n[2,5,6]\n3\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1]\n1\n[]\n0\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [0]\n0\n[1]\n1\n
 * // @lcpr case=end
 * 
 */
