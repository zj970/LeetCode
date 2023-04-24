/*
 * @lc app=leetcode.cn id=387 lang=java
 * @lcpr version=21907
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

/**
 * 使用哈希表存储频数
 * 
 */
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> frequency = new HashMap<Character,Integer>();
        /**
         * 第一次遍历后，使用哈希映射统计出字符串中每个字符出现的次数
         */
        for (int i = 0; i < s.length(); i++) {
            char ch  = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0)+1);
        }

        /**
         * 只需要遍历到了一个只出现一次的字符，那么就返回他的索引，否则在遍历结束后返回-1
         */
        for (int i = 0; i < s.length(); i++) {
            if(frequency.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }

        return -1;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "leetcode"\n
// @lcpr case=end

// @lcpr case=start
// "loveleetcode"\n
// @lcpr case=end

// @lcpr case=start
// "aabb"\n
// @lcpr case=end

 */

