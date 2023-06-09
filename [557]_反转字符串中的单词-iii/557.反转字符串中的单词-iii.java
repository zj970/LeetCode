/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    // public String reverseWords(String s) {
    //     // StringBuffer buffer = new StringBuffer();

    //     // //双指针
    //     // int fast = 0;
    //     // int slow = 0;
    //     // s = s+' ';

    //     // for(;fast < s.length();fast++)
    //     // {
    //     //     if (s.charAt(fast) == ' ')
    //     //     {
    //     //         for (int i = 1; i <= slow;i++ )
    //     //         {
    //     //             buffer.append(s.charAt(fast-i));
    //     //         }
    //     //         slow = 0;
    //     //         if(fast != s.length()-1)
    //     //         {
    //     //             buffer.append(' ');
    //     //         }
    //     //     }
    //     //     else {
    //     //         slow++;
    //     //     }

    //     // }
    //     // return buffer.toString();

    //         // 将字符串按单词分割
    //         String[] words = s.split(" ");
    //         // 对每个单词进行反转
    //         for (int i = 0; i < words.length; i++) {
    //             words[i] = new StringBuilder(words[i]).reverse().toString();
    //         }
    //         // 将反转后的单词按顺序重新拼接成字符串
    //         return String.join(" ", words);
    // }

    public static String reverseWords(String s) {
        // 将字符串转换为字符数组
        char[] charArray = s.toCharArray();
        // 定义指针和单词开始位置
        int left = 0;
        for (int right = 0; right < charArray.length; right++) {
            // 当遇到空格时将该单词进行反转，并更新左指针
            if (charArray[right] == ' ') {
                reverse(charArray, left, right - 1);
                left = right + 1;
            }
        }
        // 反转最后一个单词
        reverse(charArray, left, charArray.length - 1);
        // 将字符数组转换为字符串返回
        return new String(charArray);
    }

    private static void reverse(char[] charArray, int left, int right) {
        while (left < right) {
            char temp = charArray[left];
            charArray[left++] = charArray[right];
            charArray[right--] = temp;
        }
    }
}
// @lc code=end

