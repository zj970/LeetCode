/*
 * @lc app=leetcode.cn id=2540 lang=java
 * @lcpr version=30204
 *
 * [2540] 最小公共值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int minLength = Math.min(nums1.length, nums2.length) - 1;
        int maxLength = Math.max(nums1.length, nums2.length);
        int index1 = 0, index2 = 0;
        if (nums1.length > nums2.length) {
            for (;index1 < maxLength; index1++) {
                while (nums1[index1] > nums2[index2] && index2 < minLength) {
                    index2++;
                }
    
                if (nums1[index1] == nums2[index2]) {
                    return nums1[index1];
                }

                if (index2 == minLength && nums2[index2] < nums1[index1]) {
                    return -1;
                }

            }
        } else {
            for (;index2 < maxLength; index2++) {
                while (nums1[index1] < nums2[index2] && index1 < minLength) {
                    index1++;
                }
    
                if (nums1[index1] == nums2[index2]) {
                    return nums1[index1];
                }

                if (index1 == minLength && nums2[index2] > nums1[index1]) {
                    return -1;
                }
            }
        }

        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n[2,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,6]\n[2,3,4,5]\n
// @lcpr case=end

 */

