/*
 * @lc app=leetcode.cn id=1598 lang=java
 * @lcpr version=30112
 *
 * [1598] 文件夹操作日志搜集器
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if ("./".equals(log)) {
                continue;
            } else if ("../".equals(log)) {
                if (depth > 0) {
                    depth--;
                }
            } else {
                depth++;
            }
        }
        return depth;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["d1/","d2/","../","d21/","./"]\n
// @lcpr case=end

// @lcpr case=start
// ["d1/","d2/","./","d3/","../","d31/"]\n
// @lcpr case=end

// @lcpr case=start
// ["d1/","../","../","../"]\n
// @lcpr case=end

 */

