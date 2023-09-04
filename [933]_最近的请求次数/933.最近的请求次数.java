/*
 * @lc app=leetcode.cn id=933 lang=java
 *
 * [933] 最近的请求次数
 */

// @lc code=start
class RecentCounter {
Deque<Integer> queue;
    public RecentCounter() {
        queue = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        //遇到请求就存入队列中，存入t
        queue.offer(t);
        //peek判断有几个，并计数
        while(queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
// @lc code=end

