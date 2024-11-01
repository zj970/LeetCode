/*
 * @lc app=leetcode.cn id=2231 lang=java
 * @lcpr version=30204
 *
 * [2231] 按奇偶性交换后的最大数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> one = new PriorityQueue<>((a, b) -> (b - a));
        PriorityQueue<Integer> two = new PriorityQueue<>((a, b) -> (b - a));
        char[] n = String.valueOf(num).toCharArray();
        for (char c : n) {
            int t = c - '0';
            if (t % 2 == 1) {
                one.offer(t);
            } else {
                two.offer(t);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : n) {
            int t = c - '0';
            if (t % 2 == 1) {
                sb.append(one.poll());
            } else {
                sb.append(two.poll());
            }
        }
        return Integer.parseInt(sb.toString()); 
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1234\n
// @lcpr case=end

// @lcpr case=start
// 65875\n
// @lcpr case=end

 */

