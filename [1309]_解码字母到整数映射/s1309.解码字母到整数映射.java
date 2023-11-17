/*
 * @lc app=leetcode.cn id=1309 lang=java
 * @lcpr version=30109
 *
 * [1309] 解码字母到整数映射
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String freqAlphabets(String s) {
        int length = s.length();
        StringBuffer stringBuffer=new StringBuffer();
        int i=0;
        int j=3;
        while(i+j<=s.length()){
            char z= s.charAt(i+j-1);
            if(s.charAt(i+j-1) != '#'){
                char temp2= (char) (Integer.parseInt(s.charAt(i+j-3)+"") + 96);
                stringBuffer.append(temp2);
                i +=1;
            }else{
                int temp=Integer.parseInt(s.substring(i,j+i-1));
                stringBuffer.append((char)(temp + 96));
                i +=3;
            }
        }
        while (s.length() - i > 0) {
            char temp2 = (char) (Integer.parseInt(s.charAt(i) + "") + 96);
            stringBuffer.append(temp2);
            i += 1;
        }
        return new String(stringBuffer);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "10#11#12"\n
// @lcpr case=end

// @lcpr case=start
// "1326#"\n
// @lcpr case=end

 */

