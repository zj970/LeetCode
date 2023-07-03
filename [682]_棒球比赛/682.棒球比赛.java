/*
 * @lc app=leetcode.cn id=682 lang=java
 *
 * [682] 棒球比赛
 */

// @lc code=start
class Solution {
    public int calPoints(String[] operations) {
        //使用变长数组对栈进行模拟
        int ret = 0;
        List<Integer> pionts = new ArrayList<Integer>();
        for(String op :operations){
            int n = pionts.size();
            switch(op.charAt(0)){
                case '+':
                    ret += pionts.get(n-1) + pionts.get(n-2);
                    pionts.add(pionts.get(n-1) + pionts.get(n-2));
                    break;
                case 'D':
                    ret+=2 * pionts.get(n-1);
                    pionts.add(2 * pionts.get(n-1));
                    break;
                case 'C':
                    ret -= pionts.get(n-1);
                    pionts.remove(n-1);
                    break;
                default:
                    ret += Integer.parseInt(op);
                    pionts.add(Integer.parseInt(op));
                    break;

            }
        }

        return ret;
    }
}
// @lc code=end

