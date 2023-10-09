/*
 * @lc app=leetcode.cn id=1071 lang=java
 *
 * [1071] 字符串的最大公因子
 */

// @lc code=start
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        for(int i = Math.min(len1,len2); i >= 1; i--){
            if(len1%i == 0 && len2%i == 0){
                String x = str1.substring(0,i);
                if(check(x, str1) && check(x, str2)){
                    return x;
                }
            }
        }

        return "";
    }

    public boolean check(String t, String s){
        int lenx = s.length() / t.length();
        StringBuffer ans = new StringBuffer();
        for (int i = 1; i <= lenx; i++){
            ans.append(t);
        }
        return ans.toString().equals(s);
    }
}
// @lc code=end

