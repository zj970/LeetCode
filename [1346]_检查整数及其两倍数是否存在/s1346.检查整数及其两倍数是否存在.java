/*
 * @lc app=leetcode.cn id=1346 lang=java
 * @lcpr version=30110
 *
 * [1346] 检查整数及其两倍数是否存在
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1;j < arr.length; j++){
                if(arr[i] == 2 * arr[j] || 2 *arr[i] == arr[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,2,5,3]\n
// @lcpr case=end

// @lcpr case=start
// [7,1,14,11]\n
// @lcpr case=end

// @lcpr case=start
// [3,1,7,11]\n
// @lcpr case=end

 */

