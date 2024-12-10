/*
 * @lc app=leetcode.cn id=2437 lang=java
 * @lcpr version=30204
 *
 * [2437] 有效时间的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countTime(String time) {
        int count = 1;
        for (int i = 0; i < time.length(); i++) {
            if (i == 0 && time.charAt(0) == '?') {
                if (time.charAt(i + 1) < '4' && time.charAt(i + 1) != '?') {
                    count = 3;
                } else {
                    count = 2;
                }
            } else if (i == 1 && time.charAt(1) == '?') {
                if (count == 3) {
                    count = 24;
                } else if (count == 2) {
                    count = 24;
                } else {
                    if (count != 1) {
                        count *= 10;
                    } else {
                        if (time.charAt(0) == '2') {
                            count = 4;
                        } else {
                            count = 10;
                        }
                    }
                }
            } else if (i == 3 && time.charAt(3) == '?') {
                if (count != 1) {
                    count *= 6;
                } else {
                    count = 6;
                }
            } else if (i == 4 && time.charAt(4) == '?') {
                if (count != 1) {
                    count *= 10;
                } else {
                    count = 10;
                }
            }
        }

        return count;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "?5:00"\n
// @lcpr case=end

// @lcpr case=start
// "0?:0?"\n
// @lcpr case=end

// @lcpr case=start
// "??:??"\n
// @lcpr case=end

 */

