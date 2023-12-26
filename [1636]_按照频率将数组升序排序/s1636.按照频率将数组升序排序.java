/*
 * @lc app=leetcode.cn id=1636 lang=java
 * @lcpr version=30112
 *
 * [1636] 按照频率将数组升序排序
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int num : nums) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list, (a, b) -> {
            int cnt1 = cnt.get(a), cnt2 = cnt.get(b);
            return cnt1 != cnt2 ? cnt1 - cnt2 : b - a;
        });
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,2,2,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,1,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [-1,1,-6,4,5,-6,1,4,1]\n
// @lcpr case=end

 */

