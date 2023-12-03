/*
 * @lc app=leetcode.cn id=1446 lang=java
 * @lcpr version=30111
 *
 * [1446] 连续字符
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxPower(String s) {
        int length=1;
        for(int i=0;i<s.length();i++){
            int len=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    len++;
                }
                else if(s.charAt(i)!=s.charAt(j)){
                    i=j-1;
                    break;
                }
            }
            if(len>length){
                length=len;
            }
        }
        return length;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "leetcode"\n
// @lcpr case=end

// @lcpr case=start
// "abbcccddddeeeeedcba"\n
// @lcpr case=end

 */

