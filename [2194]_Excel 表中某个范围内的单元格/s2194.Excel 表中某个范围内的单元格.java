/*
 * @lc app=leetcode.cn id=2194 lang=java
 * @lcpr version=30204
 *
 * [2194] Excel 表中某个范围内的单元格
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<String> cellsInRange(String s) {
        char c1 = s.charAt(0), c2 = s.charAt(3);
        char r1 = s.charAt(1), r2 = s.charAt(4);
        List<String> cells = new ArrayList<>();
        for (char c = c1; c <= c2; ++c) {
            for (char r = r1; r <= r2; ++r) {
                cells.add("" + c + r);
            }
        }
        return cells;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "K1:L2"\n
// @lcpr case=end

// @lcpr case=start
// "A1:F1"\n
// @lcpr case=end

 */

