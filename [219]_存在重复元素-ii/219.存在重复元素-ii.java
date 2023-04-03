/*
 * @lc app=leetcode.cn id=219 lang=java
 * @lcpr version=21901
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int length = nums.length;
        for(int i = 0;i < length;i++)
        {
            int num = nums[i];
            if  (map.containsKey(num) && i - map.get(num) <= k)
            {
                return true;
            }

            map.put(num, i);
        }

        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,1]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,0,1,1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,1,2,3]\n2\n
// @lcpr case=end

 */


