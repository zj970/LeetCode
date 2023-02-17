/*
 * @lc app=leetcode.cn id=35 lang=java
 * @lcpr version=21601
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = n;
        int left = 0, right = n - 1;
        while(left<=right){
            int mid = ((right-left)>>1)+left;
            if(target<=nums[mid]){
                ans = mid;
                right = mid -1;
            } else{
                left = mid +1;
            }
        }
        return ans;
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
 * // [1,3,5,6]\n5\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1,3,5,6]\n2\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1,3,5,6]\n7\n
 * // @lcpr case=end
 * 
 */
