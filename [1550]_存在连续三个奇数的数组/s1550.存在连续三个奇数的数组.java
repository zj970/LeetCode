/*
 * @lc app=leetcode.cn id=1550 lang=java
 * @lcpr version=30105
 *
 * [1550] 存在连续三个奇数的数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length < 3){
            return false;
        }
    
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                if( i + 1 < arr.length && arr[i+1] % 2 == 1){
                    if(i + 2 < arr.length && arr[i+2] % 2 == 1){
                        return true;
                    }else{
                        continue;
                    }
                }else{
                    continue;
                }
            }else{
                continue;
            }
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,6,4,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,34,3,4,5,7,23,12]\n
// @lcpr case=end

 */

