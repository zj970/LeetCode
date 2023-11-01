/*
 * @lc app=leetcode.cn id=1313 lang=java
 * @lcpr version=30104
 *
 * [1313] 解压缩编码列表
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int i = 0;
        int len = 0;
        while(i < nums.length){
            len += nums[i];
            i += 2;
        }
        int[] decompress = new int[len];
        int index = 0;
        for(i = 1; i < nums.length; i+=2)
        {
            for(int j = nums[i-1]; j > 0 ; j--)
            {
                decompress[index++] = nums[i];
            }
        }
        return decompress;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,2,3]\n
// @lcpr case=end

 */

