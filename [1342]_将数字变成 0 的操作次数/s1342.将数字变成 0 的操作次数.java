/*
 * @lc app=leetcode.cn id=1342 lang=java
 * @lcpr version=30110
 *
 * [1342] 将数字变成 0 的操作次数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numberOfSteps(int num) {
        int result = 0;
        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num -= 1;
            }
            result++;
        }
        return result;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 14\n
// @lcpr case=end

// @lcpr case=start
// 8\n
// @lcpr case=end

// @lcpr case=start
// 123\n
// @lcpr case=end

 */

