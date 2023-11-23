/*
 * @lc app=leetcode.cn id=1385 lang=java
 * @lcpr version=30110
 *
 * [1385] 两个数组间的距离值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int cnt = 0;
        for(int x : arr1){
            int p = binarySearch(arr2, x);
            boolean  ok = true;
            if(p < arr2.length){
                ok &= arr2[p] -x > d;
            } 
            if(p - 1 >= 0 && p - 1 <= arr2.length){
                ok &= x - arr2[p - 1] > d;
            }

            cnt += ok ? 1 : 0;
        }
        return cnt;
    }

    public int binarySearch(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        if(arr[high] < target){
            return high +1;
        }
        while(low < high){
            int mid = (high - low)/2 + low;
            if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return low;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,5,8]\n[10,9,1,8]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,4,2,3]\n[-4,-3,6,10,20,30]\n3\n
// @lcpr case=end

// @lcpr case=start
// [2,1,100,3]\n[-5,-2,10,-3,7]\n6\n
// @lcpr case=end

 */

