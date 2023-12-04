/*
 * @lc app=leetcode.cn id=1436 lang=java
 * @lcpr version=30111
 *
 * [1436] 旅行终点站
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> a_uset = new HashSet<>();
        for (List<String> p : paths)
        {
            a_uset.add(p.get(0));
        }

        for (List<String> p : paths)
        {
            if (a_uset.contains(p.get(1)) == false){
                return p.get(1);
            }
        }

        return "";     
    }
}
// @lc code=end



/*
// @lcpr case=start
// [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]\n
// @lcpr case=end

// @lcpr case=start
// [["B","C"],["D","B"],["C","A"]]\n
// @lcpr case=end

// @lcpr case=start
// [["A","Z"]]\n
// @lcpr case=end

 */

