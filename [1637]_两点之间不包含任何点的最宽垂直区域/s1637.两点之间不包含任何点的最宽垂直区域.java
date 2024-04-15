/*
 * @lc app=leetcode.cn id=1637 lang=java
 * @lcpr version=30121
 *
 * [1637] 两点之间不包含任何点的最宽垂直区域
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {

    /**
     * 计算point[0]的最大最小值。
     * 设置桶的大小bucket_size。
     * 根据数据范围和桶的大小计算出桶的个数，bucket_cnt = (maxValue - minValue) / bucket_size +
     * 1，并初始化桶。
     * 遍历points数组，根据x坐标计算其属于哪个桶，并将其加入桶中。
     * 对于每个有数据的桶，进行排序（排序算法自定义）。
     * 遍历有数据的桶中的有序数据，计算相邻元素的差，并保存最大值作为结果。
     * 代码
     */
    // 计算当前数组中的最大最小值
    private static int[] getMinAndMax(int[][] points) {
        int maxValue = points[0][0];
        int minValue = points[0][0];
        for (int[] point : points) {
            if (point[0] > maxValue) {
                maxValue = point[0];
            } else if (point[0] < minValue) {
                minValue = point[0];
            }
        }
        return new int[] { minValue, maxValue };
    }

    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        if (n == 2)
            return Math.abs(points[0][0] - points[1][0]);
        int[] extremum = getMinAndMax(points);
        int minValue = extremum[0];
        int maxValue = extremum[1];
        // 初始化桶的大小，直接影响内存和时间
        int bucket_size = 100000;
        // 根据设定的桶大小计算桶的数量
        int bucket_cnt = (maxValue - minValue) / bucket_size + 1;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucket_cnt; i++) {
            // 初始化每个桶
            buckets.add(new ArrayList<Integer>());
        }
        for (int[] point : points) {
            // 计算数据的索引位置并加入对应桶
            int idx = (point[0] - minValue) / bucket_size;
            buckets.get(idx).add(point[0]);
        }
        for (int i = 0; i < buckets.size(); i++) {
            // 如果该桶中有数据，将桶中数据排序
            if (buckets.get(i).size() > 1) {
                Collections.sort(buckets.get(i));
                buckets.set(i, buckets.get(i));
            }
        }
        int ans = 0, pre = -1;
        for (List<Integer> bucket : buckets) {
            // 如果桶中有数据，计算与前一个数据的差，取最大值作为结果
            if (bucket.size() > 0) {
                for (int point : bucket) {
                    if (pre >= 0) {
                        ans = Math.max(ans, point - pre);
                    }
                    pre = point;
                }
            }
        }
        return ans;
    }

}
// @lc code=end

/*
 * // @lcpr case=start
 * // [[8,7],[9,9],[7,4],[9,7]]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]\n
 * // @lcpr case=end
 * 
 */
