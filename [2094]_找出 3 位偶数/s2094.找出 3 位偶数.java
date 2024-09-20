/*
 * @lc app=leetcode.cn id=2094 lang=java
 * @lcpr version=30204
 *
 * [2094] 找出 3 位偶数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<Integer>();
        int length = digits.length;
        for (int i = 0; i < length; i++) {
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < length; k++) {
                    if (k == i || k == j || digits[k] % 2 != 0) {
                        continue;
                    }
                    set.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                }
            }
        }
        int count = set.size();
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int num : set) {
            evenNumbers[index] = num;
            index++;
        }
        Arrays.sort(evenNumbers);
        return evenNumbers;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3,0]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,8,8,2]\n
// @lcpr case=end

// @lcpr case=start
// [3,7,5]\n
// @lcpr case=end

 */

