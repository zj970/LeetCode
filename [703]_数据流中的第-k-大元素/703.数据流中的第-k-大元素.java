/*
 * @lc app=leetcode.cn id=703 lang=java
 *
 * [703] 数据流中的第 K 大元素
 */

// @lc code=start
class KthLargest {
    //优先队列
    PriorityQueue<Integer> pq;
    int k;

/**
 * 使用一个大小为 k 的优先队列来存储前 k 大的元素，
 * 其中优先队列的队头为队列中最小的元素，也就是第 k大的元素。

在单次插入的操作中，我们首先将元素 val 加入到优先队列中。
如果此时优先队列的大小大于 kkk，我们需要将优先队列的队头元素弹出，
以保证优先队列的大小为 k

 */
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for( int x : nums)
        {
            add(x);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k)
        {
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
// @lc code=end

