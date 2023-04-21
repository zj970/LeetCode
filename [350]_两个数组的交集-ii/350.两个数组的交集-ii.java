/*
 * @lc app=leetcode.cn id=350 lang=java
 * @lcpr version=21906
 *
 * [350] 两个数组的交集 II
 */

import java.util.Arrays;

/**
 * 
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 * 提示：

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 

进阶：

如果给定的数组已经排好序呢？你将如何优化你的算法？
如果 nums1 的大小比 nums2 小，哪种方法更优？
如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * 
 * 
 */
// @lc code=start

/**
 * 如果两个数组是有序的，初始时，两个指针分别指向数组的头部
 * 每次比较两个指针指向的两个数组中的数字，如果两个数字不相等，则指向较小数字的指针右移一位
 * 如果两个数字相等，则将数字添加到答案，并将两个指针都右移一位
 * 当至少有一个数组指针超出数组范围时，遍历结束
 * 最终将结果重新截取copy返回答案
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int length1 = nums1.length;
        int length2 = nums2.length;

        int[] intersection = new int[Math.min(length1, length2)];

        int index = 0, index1 = 0 , index2 = 0;

        while(index1 < length1 && index2 < length2)
        {
            if(nums1[index1] < nums2[index2])
            {
                index1++;
            } else if(nums1[index1] > nums2[index2])
            {
                index2++;
            } else
            {
                intersection[index++] = nums1[index1];
                index1++;
                index2++;
            }
        }

        return Arrays.copyOfRange(intersection, 0, index);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,1]\n[2,2]\n
// @lcpr case=end

// @lcpr case=start
// [4,9,5]\n[9,4,9,8,4]\n
// @lcpr case=end

 */

