/*
 * @lc app=leetcode.cn id=1252 lang=java
 * @lcpr version=30109
 *
 * [1252] 奇数值单元格的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        //模拟
        // int count = 0;
        // int j,i = 0;
        // int[][] maps = new int[m][n];

        // for(; i < indices.length; i++){
        //     j = 0;
        //     for(; j < n; j++)
        //     {
        //         maps[indices[i][0]][j] += 1;
        //     }
        //     j = 0;
        //     for(; j < m; j++)
        //     {
        //         maps[j][indices[i][1]] += 1;
        //     }
        // }

        // for(i = 0; i < maps.length; i++)
        // {
        //     for(j = 0; j < maps[i].length; j++)
        //     {
        //         if(maps[i][j] % 2 == 1)
        //         {
        //             count++;
        //         }
        //     }
        // }

        // return count;

        //每一行会有n个数变为奇数，每一列会有m个数变为奇数，但是每一个行和列的交点都是偶数(不满足题意)， 却被计算了两次，所以要刨除掉所有交点的次数

        int[] rows = new int[m];
        int[] cols = new int[n];
        for(int[] indice : indices)
        {
            rows[indice[0]] ^= 1;
            cols[indice[1]] ^= 1;
        }

        int r = 0 ,c = 0;

        for(int i = 0; i < m; i++)
        {
            r += rows[i];
        }
        for(int i = 0; i < n; i++)
        {
            c += cols[i];
        }

        return r*n + c*m - 2*r*c;

    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n3\n[[0,1],[1,1]]\n
// @lcpr case=end

// @lcpr case=start
// 2\n2\n[[1,1],[0,0]]\n
// @lcpr case=end

 */

