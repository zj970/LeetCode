/*
 * @lc app=leetcode.cn id=1185 lang=java
 * @lcpr version=30105
 *
 * [1185] 一周中的第几天
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        /* 输入年份之前的年份的天数贡献 */
        int days = 365 * (year - 1971) + (year - 1969) / 4;
        /* 输入年份中，输入月份之前的月份的天数贡献 */
        for (int i = 0; i < month - 1; ++i) {
            days += monthDays[i];
        }
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days += 1;
        }
        /* 输入月份中的天数贡献 */
        days += day;
        return week[(days + 3) % 7];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 31\n8\n2019\n
// @lcpr case=end

// @lcpr case=start
// 18\n7\n1999\n
// @lcpr case=end

// @lcpr case=start
// 15\n8\n1993\n
// @lcpr case=end

 */

