/*
 * @lc app=leetcode.cn id=2215 lang=java
 * @lcpr version=30109
 *
 * [2215] 找出两数组的不同
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map map1 = new HashMap();
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i],i);
        }
        Map map2 = new HashMap();
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i],i);
        }
        
        List<Integer> list2 = new ArrayList();
        map2.forEach((k,v) -> {
            if(null==map1.get(k)){
                list2.add((Integer) k);
            }
        });

        List<Integer> list1 = new ArrayList();
        map1.forEach((k,v) -> {
            if(null==map2.get(k)){
                list1.add((Integer) k);
            }
        });
        List<List<Integer>> list = new ArrayList();
        list.add(list1);
        list.add(list2);
        return list;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n[2,4,6]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,3]\n[1,1,2,2]\n
// @lcpr case=end

 */

