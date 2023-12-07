/*
 * @lc app=leetcode.cn id=1491 lang=java
 * @lcpr version=30111
 *
 * [1491] 去掉最低工资和最高工资后的工资平均值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;

        for (int i = 1; i < salary.length - 1; ++i) {
            sum += salary[i];
        }

        return (double) sum / (salary.length - 2);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4000,3000,1000,2000]\n
// @lcpr case=end

// @lcpr case=start
// [1000,2000,3000]\n
// @lcpr case=end

// @lcpr case=start
// [6000,5000,4000,3000,2000,1000]\n
// @lcpr case=end

// @lcpr case=start
// [8000,9000,2000,3000,6000,1000]\n
// @lcpr case=end

 */

