/*
 * @lc app=leetcode.cn id=2566 lang=java
 * @lcpr version=30204
 *
 * [2566] 替换一个数字后的最大差值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    static final int MIN_DIGIT = 0, MAX_DIGIT = 9;

    public int minMaxDifference(int num) {
        int maxUnit = getMaxUnit(num);
        return getMaxValue(num, maxUnit) - getMinValue(num, maxUnit);
    }

    public int getMaxUnit(int num) {
        int unit = 1;
        while (num / 10 > 0) {
            unit *= 10;
            num /= 10;
        }
        return unit;
    }

    public int getMaxValue(int num, int maxUnit) {
        int originalDigit = -1;
        while (maxUnit >= 1 && originalDigit < 0) {
            int digit = num / maxUnit % 10;
            if (digit < MAX_DIGIT) {
                originalDigit = digit;
            } else {
                maxUnit /= 10;
            }
        }
        for (int unit = maxUnit; unit >= 1; unit /= 10) {
            int digit = num / unit % 10;
            if (digit == originalDigit) {
                num -= originalDigit * unit;
                num += MAX_DIGIT * unit;
            }
        }
        return num;
    }

    public int getMinValue(int num, int maxUnit) {
        int originalDigit = num / maxUnit;
        for (int unit = maxUnit; unit >= 1; unit /= 10) {
            int digit = num / unit % 10;
            if (digit == originalDigit) {
                num -= originalDigit * unit;
                num += MIN_DIGIT * unit;
            }
        }
        return num;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 11891\n
// @lcpr case=end

// @lcpr case=start
// 90\n
// @lcpr case=end

 */

