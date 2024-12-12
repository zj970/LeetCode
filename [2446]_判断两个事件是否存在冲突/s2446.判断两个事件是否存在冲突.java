/*
 * @lc app=leetcode.cn id=2446 lang=java
 * @lcpr version=30204
 *
 * [2446] 判断两个事件是否存在冲突
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        return event1[0].compareTo(event2[1]) <= 0 && event1[1].compareTo(event2[0]) >= 0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["01:15","02:00"]\n["02:00","03:00"]\n
// @lcpr case=end

// @lcpr case=start
// ["01:00","02:00"]\n["01:20","03:00"]\n
// @lcpr case=end

// @lcpr case=start
// ["10:00","11:00"]\n["14:00","15:00"]\n
// @lcpr case=end

 */

