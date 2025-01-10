/*
 * @lc app=leetcode.cn id=2614 lang=java
 * @lcpr version=30204
 *
 * [2614] 对角线上的质数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxi=0;
        for(int i=0;i<nums.length;i++)
        {
            if(prime(nums[i][i]))
            {
                maxi=Math.max(maxi,nums[i][i]);
            }
            if(prime(nums[nums.length-i-1][i]))
            {
                maxi=Math.max(maxi,nums[nums.length-i-1][i]);
            }
        }
        return maxi;
    }
    public boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[5,6,7],[9,10,11]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,3],[5,17,7],[9,11,10]]\n
// @lcpr case=end

 */

