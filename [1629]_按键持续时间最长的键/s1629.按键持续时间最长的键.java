/*
 * @lc app=leetcode.cn id=1629 lang=java
 * @lcpr version=30112
 *
 * [1629] 按键持续时间最长的键
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length, index = 0, max = releaseTimes[0];
        for (int i = 1; i < n; i++) {
            int cur = releaseTimes[i] - releaseTimes[i-1];
            if (cur > max) {
                index = i;
                max = cur;
            }else if (cur == max && keysPressed.charAt(i) > keysPressed.charAt(index)) {
                index = i;
            }
        }

        return keysPressed.charAt(index);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [9,29,49,50]\n"cbcd"\n
// @lcpr case=end

// @lcpr case=start
// [12,23,36,46,62]\n"spuda"\n
// @lcpr case=end

 */

