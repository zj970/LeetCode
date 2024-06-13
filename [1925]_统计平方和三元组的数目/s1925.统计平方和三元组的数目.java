/*
 * @lc app=leetcode.cn id=1925 lang=java
 * @lcpr version=30203
 *
 * [1925] 统计平方和三元组的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for(int i = 1; i <= n - 1; i++){
            for(int j = 1; j <= n - 1; j++){
                for(int k = j+1; k <= n; k++){
                    if(i * i + j * j == k * k && i != j && j != k){
                        ans++;
                    }
                }
            }
        }

        return ans;

        // int count = 0;
        // int nSquare = n * n;
        // for (int a = 1; a <= n; a++) {
        //     int aSquare = a * a;
        //     for (int b = 1; aSquare + b * b <= nSquare; b++) {
        //         int cSquare = aSquare + b * b;
        //         int c = (int) Math.sqrt(cSquare);
        //         if (c * c == cSquare) {
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

 */

