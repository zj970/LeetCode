/*
 * @lc app=leetcode.cn id=2160 lang=java
 * @lcpr version=30204
 *
 * [2160] 拆分数位后四位数字的最小和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++){
            arr[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(arr);
        return arr[0] * 10 + arr[2] + arr[1] * 10 + arr[3];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2932\n
// @lcpr case=end

// @lcpr case=start
// 4009\n
// @lcpr case=end

 */

