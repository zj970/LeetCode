/*
 * @lc app=leetcode.cn id=1299 lang=java
 * @lcpr version=30104
 *
 * [1299] 将每个元素替换为右侧最大元素
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start


class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int t = arr[i];
            arr[i] = rightMax;
            if (t > rightMax)
                rightMax = t;
        }
        return arr;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [17,18,5,4,6,1]\n
// @lcpr case=end

// @lcpr case=start
// [400]\n
// @lcpr case=end

 */

