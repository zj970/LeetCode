/*
 * @lc app=leetcode.cn id=1848 lang=java
 * @lcpr version=30116
 *
 * [1848] 到目标元素的最小距离
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = 1001;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                min = Math.min(min,Math.abs(i-start));
            }
        }
        return min;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n5\n3\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n0\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1,1,1,1,1,1,1]\n1\n0\n
// @lcpr case=end

 */

