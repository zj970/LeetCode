/*
 * @lc app=leetcode.cn id=506 lang=java
 *
 * [506] 相对名次
 */

// @lc code=start
class Solution {
public String[] findRelativeRanks(int[] score) {
    int n = score.length;
    // 存储排名
    Integer[] ranking = new Integer[n];
    for (int i = 0; i < n; i++) {
        ranking[i] = i;
    }
    Arrays.sort(ranking, (a, b) -> score[b] - score[a]); // 按得分从高到低排序
    String[] ans = new String[n];
    for (int i = 0; i < n; i++) {
        if (i == 0) {
            ans[ranking[i]] = "Gold Medal";
        } else if (i == 1) {
            ans[ranking[i]] = "Silver Medal";
        } else if (i == 2) {
            ans[ranking[i]] = "Bronze Medal";
        } else {
            ans[ranking[i]] = String.valueOf(i+1);
        }
    }
    return ans;
}
}
// @lc code=end

