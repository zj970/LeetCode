/*
 * @lc app=leetcode.cn id=2418 lang=java
 * @lcpr version=30204
 *
 * [2418] 按身高排序
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start


class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;

                    String temStr = names[i];
                    names[i] = names[j];
                    names[j] = temStr;
                }
            }
        }

        return names;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["Mary","John","Emma"]\n[180,165,170]\n
// @lcpr case=end

// @lcpr case=start
// ["Alice","Bob","Bob"]\n[155,185,150]\n
// @lcpr case=end

 */

