/*
 * @lc app=leetcode.cn id=575 lang=java
 *
 * [575] 分糖果
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candyType) {
        // 贫民算法
        // Arrays.sort(candyType);
        // int startPoint = 1;
        // int current = candyType[0];
        // for(int i = 1 ; i < candyType.length; i++)
        // {
        //     if (current != candyType[i])
        //     {
        //         startPoint++;
        //         current = candyType[i];
        //     }
        // }
        // return Math.min(startPoint, candyType.length >> 1);


        int n = candyType.length;
        int maxTypes = n / 2; // 最多可以吃到的糖的种类数
        Set<Integer> set = new HashSet<>();
        for (int c : candyType) {
            set.add(c);
        }
        int types = set.size(); // 所有不同的糖的种类数
        return Math.min(types, maxTypes);

    }
}
// @lc code=end

