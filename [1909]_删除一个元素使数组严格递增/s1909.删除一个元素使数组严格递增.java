/*
 * @lc app=leetcode.cn id=1909 lang=java
 * @lcpr version=30122
 *
 * [1909] 删除一个元素使数组严格递增
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int times=0;
        if(nums.length==1 || nums.length==2){
            return true;
        }
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                if(times>=1){
                    return false;
                }else{
                    times = 1;
                    if(i<nums.length-1 && i>0 && nums[i-1]<nums[i+1] ){
                        continue;
                    }else if(i<nums.length-2 &&  nums[i]<nums[i+2]){
                        continue;
                    }else if(i==0||i==nums.length-2){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,10,5,7]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

 */

