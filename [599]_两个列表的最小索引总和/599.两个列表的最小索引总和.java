/*
 * @lc app=leetcode.cn id=599 lang=java
 *
 * [599] 两个列表的最小索引总和
 */

// @lc code=start
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        //将list1中的餐厅存储到哈希表
        for (int i = 0; i < list1.length;i++)
        {
            map.put(list1[i],i);
        }
        int minSum = Integer.MAX_VALUE;

        //遍历list2中的餐厅，查询哈希表中是否存在相同的餐厅
        for(int i = 0; i < list2.length; i++)
        {
            Integer index = map.get(list2[i]);
            if(index != null)
            {
                int sum = i+index;
                if(sum < minSum)
                {
                    minSum = sum;
                    result.clear();
                    result.add(list2[i]);
                } else if(sum == minSum)
                {
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
// @lc code=end

