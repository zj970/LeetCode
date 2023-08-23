/*
 * @lc app=leetcode.cn id=884 lang=java
 *
 * [884] 两句话中的不常见单词
 */

// @lc code=start
class Solution {
    /**
     * 使用HashMap来判断是否重复
     */
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> freq = new HashMap<String, Integer>();
        insert(s1,freq);
        insert(s2,freq);

        List<String> ans = new ArrayList<String>();

        for(Map.Entry<String, Integer> entry : freq.entrySet())
        {
            if(entry.getValue() == 1)//表示只出现一次
            {
                ans.add(entry.getKey());
            
            }
        }
        return ans.toArray(new String[0]);
    }

    /**
     * 填充HashMap
     * @parms str 需要裁剪的字符串
     * @parms freq 哈希表
     */
    public void insert(String str, Map<String, Integer> freq)
    {
        String[] arr = str.split(" ");//以空格裁剪出为String[]
        for(String word : arr)
        {
            //Map<K,V>
            //以String 为Key向其添加，后面Integer表示出现的次数
            freq.put(word, freq.getOrDefault(word, 0)+1);
        }
    }
}
// @lc code=end

