/*
 * @lc app=leetcode.cn id=2248 lang=java
 * @lcpr version=30204
 *
 * [2248] 多个数组求交集
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int numArrays = nums.length;
        for (int[] arr : nums) {
            for (int num : arr) {
                counts.put(num, counts.getOrDefault(num, 0) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = counts.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == numArrays) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,3],[4,5,6]]\n
// @lcpr case=end

 */

