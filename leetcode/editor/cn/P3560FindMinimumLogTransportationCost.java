package editor.cn;
//给你三个整数 n、m 和 k。 
//
// 有两根长度分别为 n 和 m 单位的木材，需要通过三辆卡车运输。每辆卡车最多只能装载一根长度 不超过 k 单位的木材。 
//
// 你可以将木材切成更小的段，其中将长度为 x 的木材切割成长度为 len1 和 len2 的段的成本为 cost = len1 * len2，并且满足 
//len1 + len2 = x。 
//
// 返回将木材分配到卡车上的 最小总成本 。如果木材不需要切割，总成本为 0。 
//
// 
//
// 示例 1： 
//
// 
// 输入： n = 6, m = 5, k = 5 
// 
//
// 输出： 5 
//
// 解释： 
//
// 将长度为 6 的木材切割成长度为 1 和 5 的两段，成本为 1 * 5 == 5。现在三段长度分别为 1、5 和 5 的木材可以分别装载到每辆卡车。 
//
// 示例 2： 
//
// 
// 输入： n = 4, m = 4, k = 6 
// 
//
// 输出： 0 
//
// 解释： 
//
// 两根木材已经可以直接装载到卡车上，因此不需要切割。 
//
// 
//
// 提示： 
//
// 
// 2 <= k <= 10⁵ 
// 1 <= n, m <= 2 * k 
// 输入数据保证木材总存在能被运输的方案。 
// 
//
// Related Topics 数学 👍 3 👎 0


/**
 * @author zj970
 * @since 2025-10-31 23:48:33
 */
public class P3560FindMinimumLogTransportationCost {
    public static void main(String[] args) {
        Solution solution = new P3560FindMinimumLogTransportationCost().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public long minCuttingCost(int n, int m, int k) {
            int max = n > m ? n : m;
            return k >= max ? 0L : (max - k) * 1L * k;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}