/*
 * @lc app=leetcode.cn id=821 lang=java
 *
 * [821] 字符的最短距离
 */

//起始令所有的 ans[i]=−1ans[i] = -1ans[i]=−1，
//然后将所有的 c 字符的下标入队，并更新 ans[i]=0ans[i] = 0ans[i]=0，
//然后跑一遍 BFS 逻辑，通过 ans[i]ans[i]ans[i] 是否为 −1-1−1 来判断是否重复入队。
// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                d.addLast(i);
                ans[i] = 0;
            }
        }
        int[] dirs = new int[]{-1, 1};
        while (!d.isEmpty()) {
            int t = d.pollFirst();
            for (int di : dirs) {
                int ne = t + di;
                if (ne >= 0 && ne < n && ans[ne] == -1) {
                    ans[ne] = ans[t] + 1;
                    d.addLast(ne);
                }
            }
        }
        return ans;
    }
}
// @lc code=end

