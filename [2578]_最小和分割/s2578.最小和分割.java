/*
 * @lc app=leetcode.cn id=2578 lang=java
 * @lcpr version=30204
 *
 * [2578] 最小和分割
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int splitNum(int num) {
        char[] s = Integer.toString(num).toCharArray();
        Arrays.sort(s);
        int[] a = new int[2];
        for (int i = 0; i < s.length; i++)
            a[i % 2] = a[i % 2] * 10 + s[i] - '0'; // 按照奇偶下标分组
        return a[0] + a[1];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4325\n
// @lcpr case=end

// @lcpr case=start
// 687\n
// @lcpr case=end

 */

