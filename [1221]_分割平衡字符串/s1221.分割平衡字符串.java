/*
 * @lc app=leetcode.cn id=1221 lang=java
 * @lcpr version=30109
 *
 * [1221] 分割平衡字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int balancedStringSplit(String s) {
        char[] arrays = s.toCharArray();
        int n = arrays.length;
        int ans = 0;
        for(int i = 0; i < n; ){
            int j = i+1;
            int source = arrays[i] == 'L' ? 1 : -1;
            while(j < n && source!=0)
            {
                source += arrays[j++] == 'L' ? 1:-1;
            }
            i = j;
            ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "RLRRLLRLRL"\n
// @lcpr case=end

// @lcpr case=start
// "RLRRRLLRLL"\n
// @lcpr case=end

// @lcpr case=start
// "LLLLRRRR"\n
// @lcpr case=end

 */

