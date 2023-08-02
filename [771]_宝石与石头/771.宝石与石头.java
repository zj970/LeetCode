/*
 * @lc app=leetcode.cn id=771 lang=java
 *
 * [771] 宝石与石头
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count  = 0;
        for (int i = 0; i < stones.length();i++)
        {
            for(int j = 0; j < jewels.length();j++)
            {
                if(stones.charAt(i) == jewels.charAt(j))
                {
                    count++;
                }
            }
        }

        return count;
    }
}
// @lc code=end

