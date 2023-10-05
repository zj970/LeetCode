/*
 * @lc app=leetcode.cn id=1046 lang=java
 *
 * [1046] 最后一块石头的重量
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int length = stones.length;
        int x = 0;
        int y = 0;
        if(stones.length >= 3)
        {
            for (int i = length - 2; i >= 0; i--) {
                        Arrays.sort(stones);
                        x = stones[length - 2];
                        y = stones[length - 1];
                        int temp = y - x;
                        stones[i] = temp;
                        length--;
                    }
            return stones[0];
        }else if(stones.length == 2)
        {
            if(stones[0] == stones[1])
            {
                return 0;
            }else{
                return stones[1] - stones[0];
            }
        }else{
            return stones[0];
        }
    }
}
// @lc code=end

