/*
 * @lc app=leetcode.cn id=2788 lang=java
 * @lcpr version=30204
 *
 * [2788] 按分隔符拆分字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        // 正则表达式
        String sep = "\\" + String.valueOf(separator);
        List<String> list = new ArrayList<>();
        for (String i : words){
            String[] sp = i.split(sep);
            for (String j : sp){
                if (j != null && j.length() >= 1) list.add(j); //空的不加
            }
        }
        return list;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["one.two.three","four.five","six"]\n"."\n
// @lcpr case=end

// @lcpr case=start
// ["$easy$","$problem$"]\n"$"\n
// @lcpr case=end

// @lcpr case=start
// ["|||"]\n"|"\n
// @lcpr case=end

 */

