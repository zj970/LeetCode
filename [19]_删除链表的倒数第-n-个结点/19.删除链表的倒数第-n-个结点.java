import java.util.List;

/*
 * @lc app=leetcode.cn id=19 lang=java
 * @lcpr version=21704
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 如何得到n。循环遍历，需要两次扫描
        int sz = 1;
        ListNode tmp = head;
        while (head.next != null) {
            head = head.next;
            sz++;
        }
        if (n == 1) {
            // sz = 1 return null;
            if (sz == 1) {
                return null;
            } else {
                ListNode tmp2 = tmp;
                for (; sz > n + 1; sz--) {
                    tmp = tmp.next;
                }
                tmp.next = null;
                return tmp2;
            }
            // sz != 1 head.next.next = null
        } else {
            // sz == n
            if (n == sz) {
                ListNode tmp2 = tmp.next;
                return tmp2;
            } else {
                ListNode tmp2 = tmp;
                for (; sz > n + 1; sz--) {
                    tmp = tmp.next;
                }
                tmp.next = tmp.next.next;
                return tmp2;
            }
            // sz > n head.next = head.next.next;
        }
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * // [1,2,3,4,5]\n2\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1]\n1\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1,2]\n1\n
 * // @lcpr case=end
 * 
 */
