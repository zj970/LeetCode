/*
 * @lc app=leetcode.cn id=696 lang=java
 *
 * [696] 计数二进制子串
 */

// @lc code=start
/**
 * 我们可以将字符串 sss 按照 000 和 111 的连续段分组，存在 counts\textit{counts}counts 数组中，例如 s=00111011s = 00111011s=00111011，可以得到这样的 counts\textit{counts}counts 数组：counts={2,3,1,2}\textit{counts} = \{2, 3, 1, 2\}counts={2,3,1,2}。

这里 counts\textit{counts}counts 数组中两个相邻的数一定代表的是两种不同的字符。假设 counts\textit{counts}counts 数组中两个相邻的数字为 uuu 或者 vvv，它们对应着 uuu 个 000 和 vvv 个 111，或者 uuu 个 111 和 vvv 个 000。它们能组成的满足条件的子串数目为 min⁡{u,v}\min \{ u, v \}min{u,v}，即一对相邻的数字对答案的贡献。

 */
class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<Integer>();
        int ptr = 0, n = s.length();
        while (ptr < n) {
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                ++ptr;
                ++count;
            }
            counts.add(count);
        }
        int ans = 0;
        for (int i = 1; i < counts.size(); ++i) {
            ans += Math.min(counts.get(i), counts.get(i - 1));
        }
        return ans;
    }
}

// @lc code=end

