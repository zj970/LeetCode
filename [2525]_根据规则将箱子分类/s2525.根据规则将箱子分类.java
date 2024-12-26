/*
 * @lc app=leetcode.cn id=2525 lang=java
 * @lcpr version=30204
 *
 * [2525] 根据规则将箱子分类
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = (length >= 10000 || width >= 10000 || height >= 10000) || (width*height >= 1000000000/length) ;
        boolean isHeavy = mass >= 100;

        //retuen 
        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky && !isHeavy) {
            return "Bulky";
        } else if (isHeavy && !isBulky) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1000\n35\n700\n300\n
// @lcpr case=end

// @lcpr case=start
// 200\n50\n800\n50\n
// @lcpr case=end

 */

