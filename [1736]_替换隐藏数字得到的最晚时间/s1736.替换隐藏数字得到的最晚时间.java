/*
 * @lc app=leetcode.cn id=1736 lang=java
 * @lcpr version=30113
 *
 * [1736] 替换隐藏数字得到的最晚时间
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String maximumTime(String time) {
        char[] arr = time.toCharArray();
        if (arr[0] == '?') {
            arr[0] = ('4' <= arr[1] && arr[1] <= '9') ? '1' : '2';
        }
        if (arr[1] == '?') {
            arr[1] = (arr[0] == '2') ? '3' : '9';
        }
        if (arr[3] == '?') {
            arr[3] = '5';
        }
        if (arr[4] == '?') {
            arr[4] = '9';
        }
        return new String(arr);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "2?:?0"\n
// @lcpr case=end

// @lcpr case=start
// "0?:3?"\n
// @lcpr case=end

// @lcpr case=start
// "1?:22"\n
// @lcpr case=end

 */

