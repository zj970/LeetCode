/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    /**
     * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。

如果剩余字符少于 k 个，则将剩余字符全部反转。
如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
     * @param s
     * @param k
     * @return
     */
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        while (i < arr.length) {
            if (arr.length - i < k) {
                // 剩余字符少于 k 个，则将剩余字符全部反转
                reverse(arr, i, arr.length - 1);
            } else if (arr.length - i < 2 * k) {
                // 剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样
                reverse(arr, i, i + k - 1);
            } else {
                // 每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符
                reverse(arr, i, i + k - 1);
            }
            i += 2 * k;
        }
        return String.valueOf(arr);
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
// @lc code=end

