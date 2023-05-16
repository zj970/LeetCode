/*
 * @lc app=leetcode.cn id=500 lang=java
 *
 * [500] 键盘行
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。

美式键盘 中：

第一行由字符 "qwertyuiop" 组成。
第二行由字符 "asdfghjkl" 组成。
第三行由字符 "zxcvbnm" 组成。
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {
        String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keyboard.length; i++) {
            for (char c : keyboard[i].toCharArray()) {
                map.put(c, i);
            }
        }
        List<String> res = new ArrayList<>();
        for (String word : words) {
            int row = -1;
            boolean valid = true;
            for (char c : word.toLowerCase().toCharArray()) {
                int currentRow = map.get(c);
                if (row == -1) {
                    row = currentRow;
                } else if (currentRow != row) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
// @lc code=end

