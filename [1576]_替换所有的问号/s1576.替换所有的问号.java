/*
 * @lc app=leetcode.cn id=1576 lang=java
 * @lcpr version=30112
 *
 * [1576] 替换所有的问号
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String modifyString(String s) {
       char[] arr = s.toCharArray();

       for(int i = 0;i < arr.length;++i){
         if(arr[i] == '?'){
            char leftChar = i > 0 ? arr[i-1] : '\0';
            char rightChar = i < arr.length - 1 ? arr[i+1] : '\0';

            char possibaleChar = 'a';
            while (possibaleChar == leftChar || possibaleChar == rightChar) {
                possibaleChar++;
                
            }
            arr[i] = possibaleChar;
         }
       }

       return new String(arr);
    }   
}
// @lc code=end



/*
// @lcpr case=start
// "?zs"\n
// @lcpr case=end

// @lcpr case=start
// "ubv?w"\n
// @lcpr case=end

 */

