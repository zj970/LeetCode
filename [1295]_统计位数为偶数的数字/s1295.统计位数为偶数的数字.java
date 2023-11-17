/*
 * @lc app=leetcode.cn id=1295 lang=java
 * @lcpr version=30109
 *
 * [1295] 统计位数为偶数的数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(getLength(num) % 2 == 0){
                count++;
            }
        }

        return count;
    }

    public int getLength(int num){
        int length = 0;
        while(num > 0){
            length++;
            num /= 10;
        }

        return length;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [12,345,2,6,7896]\n
// @lcpr case=end

// @lcpr case=start
// [555,901,482,1771]\n
// @lcpr case=end

 */

