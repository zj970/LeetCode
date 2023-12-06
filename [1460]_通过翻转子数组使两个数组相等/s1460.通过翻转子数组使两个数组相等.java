/*
 * @lc app=leetcode.cn id=1460 lang=java
 * @lcpr version=30111
 *
 * [1460] 通过翻转子数组使两个数组相等
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = arr.length, tot = 0;
        int[] cnt = new int[1010]; 
        for (int i = 0; i < n; i++) {
            if (++cnt[target[i]] == 1) tot++;
            if (--cnt[arr[i]] == 0) tot--;
        }
        return tot == 0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n[2,4,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [7]\n[7]\n
// @lcpr case=end

// @lcpr case=start
// [3,7,9]\n[3,7,11]\n
// @lcpr case=end

 */

