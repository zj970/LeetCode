/*
 * @lc app=leetcode.cn id=2164 lang=java
 * @lcpr version=30204
 *
 * [2164] 对奇偶下标分别排序
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        //小根堆，非递减
        PriorityQueue<Integer> ou = new PriorityQueue<>(); 
        //大根堆，非递增
        PriorityQueue<Integer> ji = new PriorityQueue<>((a, b)->{
            return b - a;
        });

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) ou.offer(nums[i]);
            else ji.offer(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) nums[i] = ou.poll();
            else nums[i] = ji.poll();
        }

        return nums; 
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,1]\n
// @lcpr case=end

 */

