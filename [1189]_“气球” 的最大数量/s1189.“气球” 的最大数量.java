/*
 * @lc app=leetcode.cn id=1189 lang=java
 * @lcpr version=30105
 *
 * [1189] “气球” 的最大数量
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] maps = new char[] {'b','a','l','o','n'};
        int[] index = new int[maps.length];
        for(int i = 0; i < text.length(); i++)
        {
            for(int j = 0; j < maps.length; j++){
                if(text.charAt(i) == maps[j]){
                    index[j] += 1;
                    break;
                }
            }
        }

        index[2] /= 2;
        index[3] /= 2;

        Arrays.sort(index);

        return index[0];
    }
}
// @lc code=end



/*
// @lcpr case=start
// "nlaebolko"\n
// @lcpr case=end

// @lcpr case=start
// "loonbalxballpoon"\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n
// @lcpr case=end

 */

