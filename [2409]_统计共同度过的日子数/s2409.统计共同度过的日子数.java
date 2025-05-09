/*
 * @lc app=leetcode.cn id=2409 lang=java
 * @lcpr version=30204
 *
 * [2409] 统计共同度过的日子数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] datesOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] prefixSum = new int[13];
        for (int i = 0; i < 12; i++) {
            prefixSum[i + 1] = prefixSum[i] + datesOfMonths[i];
        }

        int arriveAliceDay = calculateDayOfYear(arriveAlice, prefixSum);
        int leaveAliceDay = calculateDayOfYear(leaveAlice, prefixSum);
        int arriveBobDay = calculateDayOfYear(arriveBob, prefixSum);
        int leaveBobDay = calculateDayOfYear(leaveBob, prefixSum);
        return Math.max(0, Math.min(leaveAliceDay, leaveBobDay) - Math.max(arriveAliceDay, arriveBobDay) + 1);
    }

    public int calculateDayOfYear(String day, int[] prefixSum) {
        int month = Integer.parseInt(day.substring(0, 2));
        int date = Integer.parseInt(day.substring(3));
        return prefixSum[month - 1] + date;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "08-15"\n"08-18"\n"08-16"\n"08-19"\n
// @lcpr case=end

// @lcpr case=start
// "10-01"\n"10-31"\n"11-01"\n"12-31"\n
// @lcpr case=end

 */

