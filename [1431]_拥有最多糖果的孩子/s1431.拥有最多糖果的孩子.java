/*
 * @lc app=leetcode.cn id=1431 lang=java
 * @lcpr version=30111
 *
 * [1431] 拥有最多糖果的孩子
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = candies[0];
        for(int i = 1; i < n; ++i) {
           if(candies[i] > max) max = candies[i];
        }        
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            if(candies[i] + extraCandies >= max)
            {
                res.add(true);
            } else{
                res.add(false);
            } 
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,5,1,3]\n3\n
// @lcpr case=end

// @lcpr case=start
// [4,2,1,1,2]\n1\n
// @lcpr case=end

// @lcpr case=start
// [12,1,12]\n10\n
// @lcpr case=end

 */

