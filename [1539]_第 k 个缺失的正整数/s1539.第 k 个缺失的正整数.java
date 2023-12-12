/*
 * @lc app=leetcode.cn id=1539 lang=java
 * @lcpr version=30111
 *
 * [1539] 第 k 个缺失的正整数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = 0, i = 1;
        int j = arr[arr.length - 1] + k + 1;
        for(;i < j; i++){
            if(n < arr.length && i == arr[n]){
                n++;
            }else{
                k--;
                if(k == 0){
                    break;
                }
            }
        }

        return i;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,4,7,11]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n2\n
// @lcpr case=end

 */

