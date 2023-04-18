/*
 * @lc app=leetcode.cn id=338 lang=java
 * @lcpr version=21906
 *
 * [338] 比特位计数
 */

// @lc code=start
/**
 * 方法二：动态规划——最高有效位
方法一需要对每个整数使用 O(\log n)O(logn) 的时间计算「一比特数」。可以换一个思路，当计算 ii 的「一比特数」时，如果存在 0 \le j<i0≤j<i，jj 的「一比特数」已知，且 ii 和 jj 相比，ii 的二进制表示只多了一个 11，则可以快速得到 ii 的「一比特数」。

令 {bits}[i]bits[i] 表示 ii 的「一比特数」，则上述关系可以表示成：{bits}[i]= {bits}[j]+1bits[i]=bits[j]+1。

对于正整数 xx，如果可以知道最大的正整数 yy，使得 y \le xy≤x 且 yy 是 22 的整数次幂，则 yy 的二进制表示中只有最高位是 11，其余都是 00，此时称 yy 为 xx 的「最高有效位」。令 z=x-yz=x−y，显然 0 \le z<x0≤z<x，则 {bits}[x]={bits}[z]+1bits[x]=bits[z]+1。

为了判断一个正整数是不是 22 的整数次幂，可以利用方法一中提到的按位与运算的性质。如果正整数 yy 是 22 的整数次幂，则 yy 的二进制表示中只有最高位是 11，其余都是 00，因此 y~\&~(y-1)=0y & (y−1)=0。由此可见，正整数 yy 是 22 的整数次幂，当且仅当 y~\&~(y-1)=0y & (y−1)=0。

显然，00 的「一比特数」为 00。使用 {highBit}highBit 表示当前的最高有效位，遍历从 11 到 nn 的每个正整数 ii，进行如下操作。

如果 i~\&~(i-1)=0i & (i−1)=0，则令 {highBit}=ihighBit=i，更新当前的最高有效位。

ii 比 i-{highBit}i−highBit 的「一比特数」多 11，由于是从小到大遍历每个整数，因此遍历到 ii 时，i-{highBit}i−highBit 的「一比特数」已知，令 {bits}[i]={bits}[i-{highBit}]+1bits[i]=bits[i−highBit]+1。

最终得到的数组 {bits}bits 即为答案。
 */
class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        int hightBit = 0;
        for(int j = 1; j<=n; j++)
        {
            if((j &(j-1)) == 0)
            {
                hightBit = j;
            }
            bits[j] = bits[j-hightBit]+1;
        }

        return bits;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 5\n
// @lcpr case=end

 */

