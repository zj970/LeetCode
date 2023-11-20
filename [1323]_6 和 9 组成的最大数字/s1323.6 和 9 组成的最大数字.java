/*
 * @lc app=leetcode.cn id=1323 lang=java
 * @lcpr version=30110
 *
 * [1323] 6 和 9 组成的最大数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximum69Number (int num) {
        StringBuffer s=new StringBuffer(Integer.toString(num));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '6'){
                s.deleteCharAt(i);
                s.insert(i,'9');
                break;
            }
        }
        return Integer.parseInt(s.toString());
    }
}
// @lc code=end



/*
// @lcpr case=start
// 9669\n
// @lcpr case=end

// @lcpr case=start
// 9996\n
// @lcpr case=end

// @lcpr case=start
// 9999\n
// @lcpr case=end

 */

