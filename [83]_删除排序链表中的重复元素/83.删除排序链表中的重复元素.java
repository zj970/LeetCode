/*
 * @lc app=leetcode.cn id=83 lang=java
 * @lcpr version=21704
 *
 * [83] 删除排序链表中的重复元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        /**
         * 新建一个ListNode对象，将原来的地址复制给它
         * 当满足两个值相当的时候，就将跳过此位置
         */
        ListNode tmp = head;
        while (tmp.next != null) {
            if (tmp.val == tmp.next.val){
                tmp.next = tmp.next.next;
            }else {
                tmp = tmp.next;
            }
        }
        return head;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// [1,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,2,3,3]\n
// @lcpr case=end

 */


