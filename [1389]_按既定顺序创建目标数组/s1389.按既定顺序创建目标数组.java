/*
 * @lc app=leetcode.cn id=1389 lang=java
 * @lcpr version=30111
 *
 * [1389] 按既定顺序创建目标数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = 0; i < nums.length; ++i) {
            res.add(index[i], nums[i]);
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,2,3,4]\n[0,1,2,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,0]\n[0,1,2,3,0]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n[0]\n
// @lcpr case=end

 */

