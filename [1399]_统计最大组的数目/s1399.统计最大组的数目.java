/*
 * @lc app=leetcode.cn id=1399 lang=java
 * @lcpr version=30110
 *
 * [1399] 统计最大组的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countLargestGroup(int n) {
       int hx[]=new int[37];
        int max=0,len=0;
        for(int i=1;i<=n;i++){
            int ans=total(i);
            hx[ans]++;
            if(hx[ans]>max){
                max=hx[ans];
                len=0;
            }
            if(hx[ans]==max){
                len++;
            }
        }
        return len;
    }
    public int total(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 13\n
// @lcpr case=end

// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 15\n
// @lcpr case=end

// @lcpr case=start
// 24\n
// @lcpr case=end

 */

