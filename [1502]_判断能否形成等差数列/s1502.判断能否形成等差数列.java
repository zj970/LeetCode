/*
 * @lc app=leetcode.cn id=1502 lang=java
 * @lcpr version=30111
 *
 * [1502] 判断能否形成等差数列
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for(int i = 2; i < arr.length; ++i) {
            if(arr[i] - arr[i-1] != d) return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,5,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,4]\n
// @lcpr case=end

 */

