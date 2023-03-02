/*
 * @lc app=leetcode.cn id=168 lang=java
 * @lcpr version=21708
 * A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
输入：columnNumber = 701
输出："ZY"

1 <= columnNumber <= 231 - 1
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        //转26进制数 A = 65 ,Z = 90;
        // 1 <= columnNumber <= 231 - 1
        // 8>=size>1;
        char c = 'A';
        if(columnNumber<=26){
            int a0 = (columnNumber - 1) % 26 + 1;
            c = (char)(a0 - 1 + c);
            return String.valueOf(c);
        }else{
            int a0 = (columnNumber - 1) % 26 + 1;
            c = (char)(a0 - 1 + c);
            return convertToTitle((columnNumber - a0) / 26)+c;
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
// @lcpr case=start
// 1\n
// @lcpr case=end

// @lcpr case=start
// 28\n
// @lcpr case=end

// @lcpr case=start
// 701\n
// @lcpr case=end

// @lcpr case=start
// 2147483647\n
// @lcpr case=end

 */


