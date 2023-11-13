/*
 * @lc app=leetcode.cn id=2303 lang=java
 * @lcpr version=30109
 *
 * [2303] 计算应缴税款总额
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double totalTax = 0;
        int lower = 0;
        for (int[] bracket : brackets) {
            int upper = bracket[0], percent = bracket[1];
            int tax = (Math.min(income, upper) - lower) * percent;
            totalTax += tax;
            if (income <= upper) {
                break;
            }
            lower = upper;
        }
        return (double) totalTax / 100.0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[3,50],[7,10],[12,25]]\n10\n
// @lcpr case=end

// @lcpr case=start
// [[1,0],[4,25],[5,50]]\n2\n
// @lcpr case=end

// @lcpr case=start
// [[2,50]]\n0\n
// @lcpr case=end

 */

