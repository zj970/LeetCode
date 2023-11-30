/*
 * @lc app=leetcode.cn id=1408 lang=java
 * @lcpr version=30111
 *
 * [1408] 数组中的字符串匹配
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                if(words[j].indexOf(words[i]) >= 0){
                    ans.add(words[i]);
                    break;
                }
            }
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["mass","as","hero","superhero"]\n
// @lcpr case=end

// @lcpr case=start
// ["leetcode","et","code"]\n
// @lcpr case=end

// @lcpr case=start
// ["blue","green","bu"]\n
// @lcpr case=end

 */

