/*
 * @lc app=leetcode.cn id=160 lang=java
 * @lcpr version=21801
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //利用哈希表存储链表的节点
        Set<ListNode> visited = new HashSet<ListNode>();
        ListNode temp = headA;
        while(temp != null){
            visited.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while(temp!=null){
            if(visited.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }

        return temp;

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
// 8\n[4,1,8,4,5]\n[5,6,1,8,4,5]\n2\n3\n
// @lcpr case=end

// @lcpr case=start
// 2\n[1,9,1,2,4]\n[3,2,4]\n3\n1\n
// @lcpr case=end

// @lcpr case=start
// 0\n[2,6,4]\n[1,5]\n3\n2\n
// @lcpr case=end

 */


