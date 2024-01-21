/*
 * @lc app=leetcode.cn id=1773 lang=java
 * @lcpr version=30113
 *
 * [1773] 统计匹配检索规则的物品数量
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = new HashMap<String, Integer>() {{
            put("type", 0);
            put("color", 1);
            put("name", 2);
        }}.get(ruleKey);
        int res = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                res++;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]]\n"color"\n"silver"\n
// @lcpr case=end

// @lcpr case=start
// [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]]\n"type"\n"phone"\n
// @lcpr case=end

 */

