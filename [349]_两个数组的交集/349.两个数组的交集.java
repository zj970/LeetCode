/*
 * @lc app=leetcode.cn id=349 lang=java
 * @lcpr version=21906
 *
 * [349] 两个数组的交集
 */
// @lc code=start

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int num : nums1)
        {
            set1.add(num);
        }
        for(int num : nums2)
        {
            set2.add(num);
        }
        return getIntersection(set1,set2);
    }

    public int[] getIntersection(Set<Integer> set1, Set<Integer> set2)
    {
        /**
         * 保证set1为最长的数组
         */
        if(set1.size() > set2.size())
        {
            return getIntersection(set2, set1);
        }

        Set<Integer> intersetionSet = new HashSet<Integer>();

        for(int num : set1)
        {
            if(set2.contains(num))
            {
                intersetionSet.add(num);
            }
        }

        int[] intersection = new int[intersetionSet.size()];
        int index = 0;
        for(int num : intersetionSet)
        {
            intersection[index++] = num;
        }

        return intersection;
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

