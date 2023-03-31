/*
 * @lc app=leetcode.cn id=205 lang=java
 * @lcpr version=21901
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //双向映射唯一关系
        Map<Character,Character> s2t = new HashMap<Character,Character>();
        Map<Character,Character> t2s = new HashMap<Character,Character>();

        int len  = s.length();
        for(int i = 0;i<len;i++){
            char x = s.charAt(i),y = t.charAt(i);
            if((s2t.containsKey(x) && s2t.get(x) != y) ||(t2s.containsKey(y) && t2s.get(y) != x))
            {
                return false;
            }
            s2t.put(x,y);
            t2s.put(y,x);
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "egg"\n"add"\n
// @lcpr case=end

// @lcpr case=start
// "foo"\n"bar"\n
// @lcpr case=end

// @lcpr case=start
// "paper"\n"title"\n
// @lcpr case=end

 */


