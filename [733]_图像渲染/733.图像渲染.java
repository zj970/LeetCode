/*
 * @lc app=leetcode.cn id=733 lang=java
 *
 * [733] 图像渲染
 */

// @lc code=start
class Solution {

    int[] dy = {1,0,0,-1};
    int[] dx = {0,1,-1,0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currColor = image[sr][sc];
        if(currColor == color)
        {
            return image;
        }

        int n = image.length, m = image[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{sr,sc});
        image[sr][sc] = color;
        while(!queue.isEmpty())
        {
            int[] cell = queue.poll();
            int x = cell[0],y = cell[1];
            for(int i = 0; i < 4; i++){
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < n && my >= 0 && my < m && image[mx][my] == currColor) {
                    queue.offer(new int[]{mx, my});
                    image[mx][my] = color;
                }
            }
        }

        return image;
    }
}
// @lc code=end

