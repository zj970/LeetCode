/*
 * @lc app=leetcode.cn id=1603 lang=java
 * @lcpr version=30112
 *
 * [1603] 设计停车系统
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class ParkingSystem {
    int[] a=new int[3];
    public ParkingSystem(int big, int medium, int small) {
        a[0] = big;
        a[1] = medium;
        a[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(a[0] != 0){
              a[0]-- ;  
            }else{
                return false;
            }
        }
        if(carType == 2){
             if(a[1] != 0){
              a[1]-- ; 
            }else{
             return false;
            }
        }
        if(carType == 3){
             if(a[2] != 0){
              a[2]-- ;  
            }else{
                return false;
            }
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
// @lc code=end



/*
// @lcpr case=start
// ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"][[1, 1, 0], [1], [2], [3], [1]]\n
// @lcpr case=end

 */

