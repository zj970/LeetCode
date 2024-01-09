/*
 * @lc app=leetcode.cn id=1710 lang=java
 * @lcpr version=30113
 *
 * [1710] 卡车上的最大单元数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n  = boxTypes.length, ans = 0;
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        for (int i = 0, cnt = 0; i < n && cnt < truckSize; i++) {
            int a = boxTypes[i][0], b = boxTypes[i][1], c = Math.min(a, truckSize - cnt);
            cnt += c;
            ans += c * b;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,3],[2,2],[3,1]]\n4\n
// @lcpr case=end

// @lcpr case=start
// [[5,10],[2,5],[4,7],[3,9]]\n10\n
// @lcpr case=end

 */

