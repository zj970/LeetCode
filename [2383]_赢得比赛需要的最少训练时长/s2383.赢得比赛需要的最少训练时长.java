/*
 * @lc app=leetcode.cn id=2383 lang=java
 * @lcpr version=30204
 *
 * [2383] 赢得比赛需要的最少训练时长
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sum = 0;
        for (int e : energy) {
            sum += e;
        }
        int trainingHours = initialEnergy > sum ? 0 : sum + 1 - initialEnergy;
        for (int e : experience) {
            if (initialExperience <= e) {
                trainingHours += 1 + (e - initialExperience);
                initialExperience = 2 * e + 1;
            } else {
                initialExperience += e;
            }
        }
        return trainingHours;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n3\n[1,4,3,2]\n[2,6,3,1]\n
// @lcpr case=end

// @lcpr case=start
// 2\n4\n[1]\n[3]\n
// @lcpr case=end

 */

