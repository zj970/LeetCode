/*
 * @lc app=leetcode.cn id=1656 lang=java
 * @lcpr version=30112
 *
 * [1656] 设计有序流
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    //存储数据
    private String[] data;
    //指针
    private int ptr;

    public OrderedStream(int n) {
        data = new String[n];
        ptr = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        data[idKey - 1] = value;
        List<String> ans = new ArrayList<>();
        //找到连续的数据
        while (ptr < data.length && data[ptr] != null) {
            ans.add(data[ptr]);
            ptr++;
        }
        return ans;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
// @lc code=end



