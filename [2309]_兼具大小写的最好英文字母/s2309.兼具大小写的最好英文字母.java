/*
 * @lc app=leetcode.cn id=2309 lang=java
 * @lcpr version=30109
 *
 * [2309] 兼具大小写的最好英文字母
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String greatestLetter(String s) {
        int lower = 0, upper = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                lower |= 1 << (c - 'a');
            }else{
                upper |= 1 << (c - 'A');
            }
        }

        for( int i = 25;  i >= 0; i--){
            if((lower & upper & (1 << i)) != 0)
            {
                return String.valueOf((char)('A' + i));
            }
        }

        return "";
    }
}
// @lc code=end



/*
// @lcpr case=start
// "lEeTcOdE"\n
// @lcpr case=end

// @lcpr case=start
// "arRAzFif"\n
// @lcpr case=end

// @lcpr case=start
// "AbCdEfGhIjK"\n
// @lcpr case=end

 */

