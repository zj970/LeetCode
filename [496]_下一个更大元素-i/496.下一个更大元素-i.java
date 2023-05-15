/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

/**
 * nums1 中数字 x 的 下一个更大元素 是指 x 在 nums2 中对应位置 右侧 的 第一个 比 x 大的元素。

给你两个 没有重复元素 的数组 nums1 和 nums2 ，下标从 0 开始计数，其中nums1 是 nums2 的子集。

对于每个 0 <= i < nums1.length ，找出满足 nums1[i] == nums2[j] 的下标 j ，并且在 nums2 确定 nums2[j] 的 下一个更大元素 。如果不存在下一个更大元素，那么本次查询的答案是 -1 。

返回一个长度为 nums1.length 的数组 ans 作为答案，满足 ans[i] 是如上所述的 下一个更大元素 。
 */
// @lc code=start
class Solution {
/**
 * 首先，我们可以遍历 nums2 数组，并使用一个栈来维护一个下一个更大元素的关系。具体来说，每次遍历到 nums2 中的一个元素时，用一个 while 循环将栈中所有小于当前元素的元素全部出栈，并将这些元素的下一个更大元素赋为当前元素。然后将当前元素入栈。

接下来，对于 nums1 数组中的每一个元素，我们可以直接查找它在 nums2 中的位置，并返回这个元素对应的下一个更大元素（如果没有则返回 -1）。
 */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new LinkedList<>();
        int[] result = new int[nums1.length];
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}
// @lc code=end

