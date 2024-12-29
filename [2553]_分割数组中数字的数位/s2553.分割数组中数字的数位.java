/*
 * @lc app=leetcode.cn id=2553 lang=java
 * @lcpr version=30204
 *
 * [2553] 分割数组中数字的数位
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (nums[i] >= 10) {
                result.add(nums[i]%10);
                nums[i] /= 10;
            }
            result.add(nums[i]);
        }
        int[] digits = new int[result.size()];
        int index = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[index++] = result.get(i);
        }

        return digits;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [13,25,83,77]\n
// @lcpr case=end

// @lcpr case=start
// [7,1,3,9]\n
// @lcpr case=end

 */

