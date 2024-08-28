/*
 * @lc app=leetcode.cn id=1971 lang=java
 * @lcpr version=30204
 *
 * [1971] 寻找图中是否存在路径
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            adj[x].add(y);
            adj[y].add(x);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.offer(source);
        visited[source] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            if (vertex == destination) {
                break;
            }
            for (int next : adj[vertex]) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
        return visited[destination];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n[[0,1],[1,2],[2,0]]\n0\n2\n
// @lcpr case=end

// @lcpr case=start
// 6\n[[0,1],[0,2],[3,5],[5,4],[4,3]]\n0\n5\n
// @lcpr case=end

 */

