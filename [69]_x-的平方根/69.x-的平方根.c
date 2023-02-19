/*
 * @lc app=leetcode.cn id=69 lang=c
 *
 * [69] x 的平方根 
 */

// @lc code=start


int mySqrt(int x){
    long i; 
    float x2, y; 
    const float threehalfs = 1.5F ;
    x2 = x * 0.5F ; 
    y = x ; 
    i = * ( long * ) &y; // evil floating point bit level hacking 
    i = 0x5f3759df - ( i >> 1 ); // what the fuck? 
    y = * ( float * ) &i; 
    y = y * ( threehalfs - ( x2 * y * y ) ); // 1st iteration 
//  y = y * ( threehalfs - ( x2 * y * y ) ); // 2nd iteration, this can be removed
    return y ;
}
// @lc code=end

