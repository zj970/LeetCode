/*
 * @lc app=leetcode.cn id=2363 lang=java
 * @lcpr version=30204
 *
 * [2363] 合并相似的物品
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int[] v : items1) {
            map.put(v[0], map.getOrDefault(v[0], 0) + v[1]);
        }
        for (int[] v : items2) {
            map.put(v[0], map.getOrDefault(v[0], 0) + v[1]);
        }

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey(), v = entry.getValue();
            List<Integer> pair = new ArrayList<Integer>();
            pair.add(k);
            pair.add(v);
            res.add(pair);
        }
        Collections.sort(res, (a, b) -> a.get(0) - b.get(0));
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,1],[4,5],[3,8]]\n[[3,1],[1,5]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1],[3,2],[2,3]]\n[[2,1],[3,2],[1,3]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,3],[2,2]]\n[[7,1],[2,2],[1,4]]\n
// @lcpr case=end

 */

