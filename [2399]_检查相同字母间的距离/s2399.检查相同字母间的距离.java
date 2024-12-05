/*
 * @lc app=leetcode.cn id=2399 lang=java
 * @lcpr version=30204
 *
 * [2399] 检查相同字母间的距离
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start


class Solution {
    public boolean checkDistances(String s, int[] distance) {
        char[] array = s.toCharArray(); 
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int c = array[i] - 'a';
            if (last[c] != 0 && i - last[c] != distance[c]) {
                return false;
            }
            last[c] = i+1;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abaccb"\n[1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]\n
// @lcpr case=end

// @lcpr case=start
// "aa"\n[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]\n
// @lcpr case=end

 */

