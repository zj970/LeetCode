/*
 * @lc app=leetcode.cn id=1200 lang=java
 * @lcpr version=30106
 *
 * [1200] 最小绝对差
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> minimum = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        
        // int[] temp = new int[arr.length - 1];
        // for(int i = 1; i < arr.length; i++){
        //     temp[i-1] = arr[i]- arr[i-1];
        // }
        // Arrays.sort(temp);

        // int target = temp[0];

        // for(int i = 1; i < arr.length; i++){
        //     if(arr[i]- arr[i-1] == target)
        //     {
        //         List<Integer> num = new ArrayList<Integer>();
        //         num.add(arr[i-1]);
        //         num.add(arr[i]);
        //         minimum.add(num);
        //     }
        // }

        int min = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++){
            if(min < arr[i]- arr[i-1]){
                continue;
            }

            if(min > arr[i]- arr[i-1]){
                min = arr[i] - arr[i -1];
                minimum.clear();
            }

            List<Integer> num = new ArrayList<Integer>();
            num.add(arr[i-1]);
            num.add(arr[i]);
            minimum.add(num);
        }

        return minimum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,6,10,15]\n
// @lcpr case=end

// @lcpr case=start
// [3,8,-10,23,19,-4,-14,27]\n
// @lcpr case=end

 */

