/*
 * @lc app=leetcode.cn id=228 lang=java
 *
 * [228] 汇总区间
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List <String> ranges = new ArrayList<String>();
        if(nums.length == 0 || nums == null)
        {
            return ranges;
        }
        int start = nums[0];
        int end = start;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i]-1 == end)
            {
                end++;
            }else{

                if(start != end)
                {
                    String tmp = start + "->" + end;
                    ranges.add(tmp);
                } else{
                    ranges.add(String.valueOf(start));
                }

                start = nums[i];
                end = start;
            }
        }
        if(nums.length >=1 && nums[nums.length -1] == end)
                {
                    if(start != end)
                    {
                        String tmp = start + "->" + end;
                        ranges.add(tmp);
                    } else{
                        ranges.add(String.valueOf(start));
                    }
                }

        return ranges;
    }
}
// @lc code=end

