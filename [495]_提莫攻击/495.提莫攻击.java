/*
 * @lc app=leetcode.cn id=495 lang=java
 * @lcpr version=21907
 *
 * [495] 提莫攻击
 */

/**
 * 在《英雄联盟》的世界中，有一个叫 “提莫” 的英雄。他的攻击可以让敌方英雄艾希（编者注：寒冰射手）进入中毒状态。

当提莫攻击艾希，艾希的中毒状态正好持续 duration 秒。

正式地讲，提莫在 t 发起攻击意味着艾希在时间区间 [t, t + duration - 1]（含 t 和 t + duration - 1）处于中毒状态。如果提莫在中毒影响结束 前 再次攻击，中毒状态计时器将会 重置 ，在新的攻击之后，中毒影响将会在 duration 秒后结束。

给你一个 非递减 的整数数组 timeSeries ，其中 timeSeries[i] 表示提莫在 timeSeries[i] 秒时对艾希发起攻击，以及一个表示中毒持续时间的整数 duration 。

返回艾希处于中毒状态的 总 秒数。
 */
// @lc code=start
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
    /**
     * 单次扫描
我们只需要对数组进行一次扫描就可以计算出总的中毒持续时间。我们记录艾希恢复为未中毒的起始时间 {expired}expired，设艾希遭遇第 ii 次的攻击的时间为 {timeSeries}[i]timeSeries[i]。当艾希遭遇第 ii 攻击时：

如果当前他正处于未中毒状态，则此时他的中毒持续时间应增加 {duration}duration​，同时更新本次中毒结束时间 {expired}expired​ 等于 {timeSeries}[i] + {duration}timeSeries[i]+duration​；
如果当前他正处于中毒状态，由于中毒状态不可叠加，我们知道上次中毒后结束时间为 {expired}expired​​，本次中毒后结束时间为 {timeSeries}[i] + {duration}timeSeries[i]+duration​​，因此本次中毒增加的持续中毒时间为 {timeSeries}[i] + {duration} -{expired}timeSeries[i]+duration−expired​​；
我们将每次中毒后增加的持续中毒时间相加即为总的持续中毒时间。
     */
        int ans = 0;
        int expired = 0;
        for (int i = 0; i < timeSeries.Length; ++i) {
            if (timeSeries[i] >= expired) {
                ans += duration;
            } else {
                ans += timeSeries[i] + duration - expired;
            }
            expired = timeSeries[i] + duration;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,4]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n2\n
// @lcpr case=end

 */

