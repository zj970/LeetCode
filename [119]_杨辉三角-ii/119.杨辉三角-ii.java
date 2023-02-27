/*
 * @lc app=leetcode.cn id=119 lang=java
 * @lcpr version=21706
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<Integer>();
        ret.add(1);
        for(int i = 1;i<=rowIndex;i++){
            //value-----C(rowIndex,i)
            //i : i+1 =  C(r,i) : C(r,i+1) = C(r,i) : C(r,i)*(r-i+1)/m
            ret.add((int) ( (long)ret.get(i-1)*(rowIndex-i+1) /i));
        }  
        return ret;
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
// 3\n
// @lcpr case=end

// @lcpr case=start
// 0\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */


