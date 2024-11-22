/*
 * @lc app=leetcode.cn id=2325 lang=java
 * @lcpr version=30204
 *
 * [2325] 解密消息
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder decryptStr = new StringBuilder();
        char current = 'a';
        // 处理解密文本
        Map<Character, Character> rules = new HashMap<Character, Character>();
        for (int i = 0; i < key.length(); i++) {
            if (rules.size() == 26) {
                break;
            }
            char c = key.charAt(i);

            if (c != ' ' && !rules.containsKey(c)) {
                rules.put(c, current);
                ++current;
            }
        }

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c != ' ') {
                c = rules.get(c);
            }
            decryptStr.append(c);
        }

        return decryptStr.toString();

    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // "the quick brown fox jumps over the lazy dog"\n"vkbs bs t suepuv"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "eljuxhpwnyrdgtqkviszcfmabo"\n"zwx hnfx lqantp mnoeius ycgk vcnjrdb"\n
 * // @lcpr case=end
 * 
 */
