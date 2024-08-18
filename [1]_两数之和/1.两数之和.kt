/*
 * @lc app=leetcode.cn id=1 lang=kotlin
 * @lcpr version=30204
 *
 * [1] 两数之和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,7,11,15]\n9\n
// @lcpr case=end

// @lcpr case=start
// [3,2,4]\n6\n
// @lcpr case=end

// @lcpr case=start
// [3,3]\n6\n
// @lcpr case=end

 */

