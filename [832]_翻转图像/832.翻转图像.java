/*
 * @lc app=leetcode.cn id=832 lang=java
 *
 * [832] 翻转图像
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i < n; i++)
        {
            int left = 0,right = n-1;
            while(left < right)
            {
                if(image[i][left] == image[i][right])
                {
                    image[i][left] ^= 1;
                    image[i][right] ^= 1;
                }
                left++;
                right--;
            }
            if(left == right)
            {
                image[i][left] ^= 1;
            }
        }

        return image;
    }
}
// @lc code=end

