/*
 * @lc app=leetcode.cn id=1370 lang=java
 * @lcpr version=30110
 *
 * [1370] 上升下降字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String sortString(String s) {
        //相当于26个桶
        int[] bucket = new int[26];
        char[] charArr = s.toCharArray();
        //把s中的字符分别放到对应的桶里面
        for(char c : charArr){
            bucket[c - 'a']++;
        }

        char[] res = new char[s.length()];
        int index = 0;
        while (index < s.length()) {
            //先从左往右找，遍历26个桶,如果当前桶不为空，
            //就从当前桶里拿出一个元素出来
            for (int i = 0; i < 26; i++) {
                if (bucket[i] != 0) {
                    res[index++] = (char) (i + 'a');
                    bucket[i]--;//拿出之后桶中元素的个数要减1
                }
            }
            //从右往左拿，同上
            for (int i = 25; i >= 0; i--) {
                if (bucket[i] != 0) {
                    res[index++] = (char) (i + 'a');
                    bucket[i]--;
                }
            }
        }
        //把结果转化为字符串
        return new String(res);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aaaabbbbcccc"\n
// @lcpr case=end

// @lcpr case=start
// "rat"\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n
// @lcpr case=end

// @lcpr case=start
// "ggggggg"\n
// @lcpr case=end

// @lcpr case=start
// "spo"\n
// @lcpr case=end

 */

