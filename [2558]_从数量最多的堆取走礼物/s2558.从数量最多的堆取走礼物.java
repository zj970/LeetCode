/*
 * @lc app=leetcode.cn id=2558 lang=java
 * @lcpr version=30204
 *
 * [2558] 从数量最多的堆取走礼物
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b-a);
        for (int gift : gifts) {
            pq.offer(gift);
        }
        while (k > 0) {
            k--;
            int x = pq.poll();
            pq.offer((int) Math.sqrt(x));
        }

        long res = 0;
        while (!pq.isEmpty()) {
            res += pq.poll();
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [25,64,9,4,100]\n4\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1]\n4\n
// @lcpr case=end

 */

