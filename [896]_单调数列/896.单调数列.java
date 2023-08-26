/*
 * @lc app=leetcode.cn id=896 lang=java
 *
 * [896] 单调数列
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] nums) {
        int length  = nums.length;
        if(length <=2)
        {
            return true;
        }else
        {
            int i = 1;
            for(; i < length; i++)
            {
                if(nums[i] != nums[i-1])
                {
                    break;
                }
            }
            if(i == length - 1 || i == length)
            {
                return true;
            }

            if(nums[i] > nums[i-1])
            {
                for(int j = i; j < length; j++)
                {
                    if(nums[j] < nums[j - 1] || (j > 2 && nums[j] < nums[j-2]))
                    {
                        return false;
                    }
                }

            }else{

                for(int j = i; j < length; j++)
                {
                    if(nums[j] > nums[j - 1] || (j > 2 && nums[j] > nums[j-2]))
                    {
                        return false;
                    }
                }

            }
            return true;
        }
    }
}
// @lc code=end

