/*
 * @lc app=leetcode.cn id=1560 lang=java
 * @lcpr version=30112
 *
 * [1560] 圆形赛道上经过次数最多的扇区
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {

    /**
     * 如果开头小于结尾，那么中间这些数是最多的。
如果开头等于结尾，那么就开头（也即结尾）这一个数最多
如果开头大于结尾，那么从1到结尾，和从开头到n，最多。
     * @param n
     * @param rounds
     * @return
     */
    public List<Integer> mostVisited(int n, int[] rounds) {
       int start = rounds[0];
        int end = rounds[rounds.length - 1];
        if (start == end) return Arrays.asList(start);
        List<Integer> result = new ArrayList<>();
        if (start < end) {
            for (int i = start; i <= end; i++) {
                result.add(i);
            }
            return result;
        }
        //start>end
        for (int i = 1; i <= end; i++) {
            result.add(i);
        }
        for (int i = start; i <= n; i++) {
            result.add(i);
        }
        return result;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n[1,3,1,2]\n
// @lcpr case=end

// @lcpr case=start
// 2\n[2,1,2,1,2,1,2,1,2]\n
// @lcpr case=end

// @lcpr case=start
// 7\n[1,3,5,7]\n
// @lcpr case=end

 */

