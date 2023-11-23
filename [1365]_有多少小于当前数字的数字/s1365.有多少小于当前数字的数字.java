/*
 * @lc app=leetcode.cn id=1365 lang=java
 * @lcpr version=30110
 *
 * [1365] 有多少小于当前数字的数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNumbers = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] > nums[j]){
                    smallerNumbers[i]++;
                }
            }
        }

        return smallerNumbers;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,1,2,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [6,5,4,8]\n
// @lcpr case=end

// @lcpr case=start
// [7,7,7,7]\n
// @lcpr case=end

 */

