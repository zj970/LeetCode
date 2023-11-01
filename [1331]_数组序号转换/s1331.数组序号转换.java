/*
 * @lc app=leetcode.cn id=1331 lang=java
 * @lcpr version=30104
 *
 * [1331] 数组序号转换
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        //利用HashMap存入
        Map<Integer,Integer> maps = new HashMap<Integer,Integer>();

        int[][] copy = new int[2][arr.length];
        int i = 0;
        while(i < arr.length){
            copy[0][i] = arr[i++];
        }
        Arrays.sort(arr);

        int index = 1;
        for(i = 0; i < arr.length; i++){
            if(!maps.containsKey(arr[i]))
            {
                maps.put(arr[i], index++);
            }
        }

        for(i = 0; i < arr.length; i++){
           copy[1][i] = maps.get(copy[0][i]);
        }
        return copy[1];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [40,10,20,30]\n
// @lcpr case=end

// @lcpr case=start
// [100,100,100]\n
// @lcpr case=end

// @lcpr case=start
// [37,12,28,9,100,56,80,5,12]\n
// @lcpr case=end

 */

