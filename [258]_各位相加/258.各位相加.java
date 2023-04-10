/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        //循环
        // while(num > 9)
        // {
        //     int sum = 0;
        //     while(num > 0)
        //     {
        //         sum += num%10;
        //         num /=10;
        //     }
        //     num = sum;
        // }
        // return num;

        //数学
        return (num -1)%9 + 1;
    }
}
// @lc code=end

