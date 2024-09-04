/*
 * @lc app=leetcode.cn id=2011 lang=java
 * @lcpr version=30204
 *
 * [2011] 执行操作后的变量值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int reValue = 0;
        for(String operation : operations) {
            if (operation.contains("++")) {
                reValue++;
            } else if (operation.contains("--")) {
                reValue--;                
            }
        }

        return reValue;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["--X","X++","X++"]\n
// @lcpr case=end

// @lcpr case=start
// ["++X","++X","X++"]\n
// @lcpr case=end

// @lcpr case=start
// ["X++","++X","--X","X--"]\n
// @lcpr case=end

 */

