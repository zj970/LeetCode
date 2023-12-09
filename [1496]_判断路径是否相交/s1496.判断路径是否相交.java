/*
 * @lc app=leetcode.cn id=1496 lang=java
 * @lcpr version=30111
 *
 * [1496] 判断路径是否相交
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isPathCrossing(String path) {
        Set<Integer> vis = new HashSet<Integer>();

        int x = 0, y = 0;
        vis.add(getHash(x, y));

        int length = path.length();
        for (int i = 0; i < length; i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'N': --x; break;
                case 'S': ++x; break;
                case 'W': --y; break;
                case 'E': ++y; break;
            }
            int hashValue = getHash(x, y);
            if (!vis.add(hashValue)) {
                return true;
            }
        }

        return false;
    }

    public int getHash(int x, int y) {
        return x * 20001 + y;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "NES"\n
// @lcpr case=end

// @lcpr case=start
// "NESWW"\n
// @lcpr case=end

 */

