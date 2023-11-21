/*
 * @lc app=leetcode.cn id=1356 lang=java
 * @lcpr version=30110
 *
 * [1356] 根据数字二进制下 1 的数目排序
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] sortByBits(int[] arr) {
        int[] map = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            map[i] = Integer.bitCount(arr[i])* 10000000 + arr[i];
        }

        Arrays.sort(map);
        for(int i = 0; i < map.length; i++)
        {
            map[i] = map[i] % 10000000;
        }

        return map;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,2,3,4,5,6,7,8]\n
// @lcpr case=end

// @lcpr case=start
// [1024,512,256,128,64,32,16,8,4,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [10000,10000]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,5,7,11,13,17,19]\n
// @lcpr case=end

// @lcpr case=start
// [10,100,1000,10000]\n
// @lcpr case=end

 */

