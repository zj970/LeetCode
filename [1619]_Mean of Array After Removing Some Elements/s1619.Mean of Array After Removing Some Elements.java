/*
 * @lc app=leetcode.cn id=1619 lang=java
 * @lcpr version=30103
 *
 * [1619] 删除某些元素后的数组均值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length, tot = 0;
        for (int i = n / 20; i < n - n / 20; i++) tot += arr[i];
        return tot * 1.0 / (n * 0.9);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0]\n
// @lcpr case=end

// @lcpr case=start
// [6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [9,7,8,7,7,8,4,4,6,8,8,7,6,8,8,9,2,6,0,0,1,10,8,6,3,3,5,1,10,9,0,7,10,0,10,4,1,10,6,9,3,6,0,0,2,7,0,6,7,2,9,7,7,3,0,1,6,1,10,3]\n
// @lcpr case=end

// @lcpr case=start
// [4,8,4,10,0,7,1,3,7,8,8,3,4,1,6,2,1,1,8,0,9,8,0,3,9,10,3,10,1,10,7,3,2,1,4,9,10,7,6,4,0,8,5,1,2,1,6,2,5,0,7,10,9,10,3,7,10,5,8,5,7,6,7,6,10,9,5,10,5,5,7,2,10,7,7,8,2,0,1,1]\n
// @lcpr case=end

 */

