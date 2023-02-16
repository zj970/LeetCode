/*
 * @lc app=leetcode.cn id=66 lang=c
 *
 * [66] 加一
 */

// @lc code=start

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *plusOne(int *digits, int digitsSize, int *returnSize)
{
    int i = digitsSize - 1;
    digits[i] += 1;
    for (; i >= 0; i--)
    {
        if (i - 1 >= 0 && digits[i] == 10)
        {
            digits[i - 1] += 1;
            digits[i] = 0;
        }
    }
    if (digits[0] == 10)
    {
        // 扩
        int *temp;
        int new_size = digitsSize + 1;
        temp = (int *)malloc(new_size * sizeof(int));
        temp[0] = 1;
        temp[1] = 0;
        for (int j = 2; j < new_size; j++)
        {
            temp[j] = digits[j - 1];
        }
        *returnSize = new_size;
        return temp;
    }
    *returnSize = digitsSize;
    return digits;
}
// @lc code=end
