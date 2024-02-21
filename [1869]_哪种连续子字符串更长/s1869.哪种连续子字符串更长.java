/*
 * @lc app=leetcode.cn id=1869 lang=java
 * @lcpr version=30116
 *
 * [1869] 哪种连续子字符串更长
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean checkZeroOnes(String s) {
        int l=s.length();
        int m1=0,resm1=0;
        int n0=0,resn0=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i) == '1'){
                m1++;
                resm1=Math.max(m1,resm1);
                n0=0;
            }else{
                n0++;
                m1=0;
                resn0=Math.max(n0,resn0);
            }
        }
        return resm1>resn0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1101"\n
// @lcpr case=end

// @lcpr case=start
// "111000"\n
// @lcpr case=end

// @lcpr case=start
// "110100010"\n
// @lcpr case=end

 */

