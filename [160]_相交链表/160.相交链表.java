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
        // Set<ListNode> visited = new HashSet<ListNode>();
        // ListNode temp = headA;
        // while(temp != null){
        //     visited.add(temp);
        //     temp = temp.next;
        // }

        // temp = headB;
        // while(temp!=null){
        //     if(visited.contains(temp)){
        //         return temp;
        //     }
        //     temp = temp.next;
        // }

        // return temp;

        //使用双指针的方法

        //1.只有两个链表都不为空的时候，才可能相交
        if(headA == null || headB == null)
        {
            return null;
        }

        //2.1 当链表headA和headB都不位空的时候，需要将两个链表依次遍历

        ListNode tempA = headA;
        ListNode tempB = headB;

        //2.2 每步操作都需要同步更新指针
        //2.3 如何pA不为空，则将指针pA移动到下一个，如果pB不为空，则将指针pB移动到下一个
        //2.4 当pA为空，则将指针移动都链表headB的头节点;当pB为空时，则将指针移动到headA的头节点
        
        while (tempA != tempB)
        {
            // if(tempA != null)
            // {
            //     tempA = tempA.next;
            // }
            // else
            // {
            //     tempA = headB;
            // }
            // if(tempB != null)
            // {
            //     tempB = tempB.next;
            // }
            // else
            // {
            //     tempB = headA;
            // }

            //简化--->三目运算符
            tempA = tempA == null ? headB:tempA.next;
            tempB = tempB == null ? headA:tempB.next;

        }
        
        //2.5 当指针pA和pB指向同一个节点或者都为空时，返回它们的指向的指针或者为ull

        return tempA;

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


