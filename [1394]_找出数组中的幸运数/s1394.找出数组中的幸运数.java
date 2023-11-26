/*
 * @lc app=leetcode.cn id=1394 lang=java
 * @lcpr version=30111
 *
 * [1394] 找出数组中的幸运数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for (int num : arr) {
            count[num]++;
        }
        for(int i = 500; i > 0; --i) {
            if (count[i] == i && count[i] >= 1) return i;
        }
        return -1;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,2,3,3,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2,3,3]\n
// @lcpr case=end

// @lcpr case=start
// [5]\n
// @lcpr case=end

// @lcpr case=start
// [7,7,7,7,7,7,7]\n
// @lcpr case=end

 */

