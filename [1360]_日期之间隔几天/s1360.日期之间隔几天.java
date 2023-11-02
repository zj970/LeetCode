/*
 * @lc app=leetcode.cn id=1360 lang=java
 * @lcpr version=30104
 *
 * [1360] 日期之间隔几天
 */


// @lcpr-template-start

// @lcpr-template-end
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// @lc code=start
class Solution {
    //使用 Zeller 的中间结果，可以快速计算天数，速度远超模拟法
    private int zellerDays(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        if (month < 3) {
            year--;
            month += 12;
        }
        return (year - 1) * 365 + year / 4 - year / 100 + year / 400 + (month - 1) * 28 + 13 * (month + 1) / 5 - 7 + day;
    }

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(zellerDays(date1) - zellerDays(date2));
    }
}
// @lc code=end



/*
// @lcpr case=start
// "2019-06-29"\n"2019-06-30"\n
// @lcpr case=end

// @lcpr case=start
// "2020-01-15"\n"2019-12-31"\n
// @lcpr case=end

 */

