/*
 * @lc app=leetcode.cn id=13 lang=java
 * @lcpr version=21505
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    // Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
    // put('I', 1);
    // put('V', 5);
    // put('X', 10);
    // put('L', 50);
    // put('C', 100);
    // put('D', 500);
    // put('M', 1000);
    // }};
    public int romanToInt(String s) {
        if(s.equals("")||s == null){
            return 0;
        }
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            result += charToInt(s.charAt(i));
            if(i+1 < s.length() && charToInt(s.charAt(i))<charToInt(s.charAt(i+1))){
                result -= 2*charToInt(s.charAt(i));
            }
            // if(i<n-1 && symbolValues.get(s.charAt(i))<symbolValues.get(s.charAt(i+1))){
            //     result -= symbolValues.get(s.charAt(i));
            // } else{
            //     result += symbolValues.get(s.charAt(i));
            // }
        }
        return result;

    }

    /**
     * 通过字符判断返回整数
     * 该方法不稳定，速度56.09%，内存80左右
     * @param c
     * @return
     */
    public int charToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * // "III"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "IV"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "IX"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "LVIII"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "MCMXCIV"\n
 * // @lcpr case=end
 * 
 */
