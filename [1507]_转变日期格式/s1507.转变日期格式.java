/*
 * @lc app=leetcode.cn id=1507 lang=java
 * @lcpr version=30104
 *
 * [1507] 转变日期格式
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String reformatDate(String date) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Map<String, Integer> s2month = new HashMap<String, Integer>();
        for (int i = 1; i <= 12; i++) {
            s2month.put(months[i - 1], i);
        }
        String[] array = date.split(" ");
        int year = Integer.parseInt(array[2]);
        int month = s2month.get(array[1]);
        int day = Integer.parseInt(array[0].substring(0, array[0].length() - 2));
        return String.format("%d-%02d-%02d", year, month, day);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "20th Oct 2052"\n
// @lcpr case=end

// @lcpr case=start
// "6th Jun 1933"\n
// @lcpr case=end

// @lcpr case=start
// "26th May 1960"\n
// @lcpr case=end

 */

