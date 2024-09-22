/*
 * @lc app=leetcode.cn id=2103 lang=java
 * @lcpr version=30204
 *
 * [2103] 环和杆
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countPoints(String rings) {
        int n = rings.length(), ans = 0;
        int[] map = new int[128];
        for (int i = 0; i < n; i += 2) map[rings.charAt(i) - 'B'] |= 1 << (rings.charAt(i + 1) - '0');
        for (int i = 0; i < 10; i++) {
            int tot = 0;
            for (char c : new char[]{'R', 'G', 'B'}) tot += (map[c - 'B'] >> i) & 1;
            if (tot == 3) ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "B0B6G0R6R0R6G9"\n
// @lcpr case=end

// @lcpr case=start
// "B0R0G0R9R0B0G0"\n
// @lcpr case=end

// @lcpr case=start
// "G4"\n
// @lcpr case=end

 */

