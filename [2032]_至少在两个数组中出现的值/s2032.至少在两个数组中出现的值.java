/*
 * @lc app=leetcode.cn id=2032 lang=java
 * @lcpr version=30204
 *
 * [2032] 至少在两个数组中出现的值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();

        int[] arr = new int[101];
        for (int num : nums1) {
            arr[num] |= 1;
        }

        for (int num : nums2) {
            arr[num] |= 2;
        }

        for (int num : nums3) {
            arr[num] |= 4;
        }
        for (int i = 1; i <= 100; i++) {
            if ((arr[i] & (arr[i] - 1)) != 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,3,2]\n[2,3]\n[3]\n
// @lcpr case=end

// @lcpr case=start
// [3,1]\n[2,3]\n[1,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,2]\n[4,3,3]\n[5]\n
// @lcpr case=end

 */

