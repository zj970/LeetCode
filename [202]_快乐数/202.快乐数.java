/*
 * @lc app=leetcode.cn id=202 lang=java
 * @lcpr version=21901
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {

    public int getNext(int n){
        int totalSum = 0;

        while(n>0)
        {
            int d = n%10;
            n = n/10;

            totalSum += d*d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);

        //利用快慢指针的思想
        while(fastRunner != 1 && slowRunner != fastRunner)
        {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 19\n
// @lcpr case=end

// @lcpr case=start
// 2\n
// @lcpr case=end

 */


