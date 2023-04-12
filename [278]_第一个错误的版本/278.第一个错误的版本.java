/*
 * @lc app=leetcode.cn id=278 lang=java
 * @lcpr version=21905
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //二分查找
        int left = 1,right = n;

        while(left< right)// 循环直至区间左右端点相同
        {
            int mid = left + (right - left)/2;//放置计算时溢出

            if(isBadVersion(mid))
            {
                right = mid; // [left,mid]
            }else
            {
                left = mid +1;//[mid+1, right]
            }
        }

        return left;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n4\n
// @lcpr case=end

// @lcpr case=start
// 1\n1\n
// @lcpr case=end

 */


