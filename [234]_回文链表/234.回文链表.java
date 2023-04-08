/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        if(head == null)
        {
            return true;
        }

        //找到前半部分链表的尾节点并反转后半部分链表

        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);


        //判断是否回文
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while(result && p2 != null)
        {
            if(p1.val != p2.val)
            {
                result = false;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        //还原链表并返回结果
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;

    }

    /**
     * @return 返回此时中间的节点
     */
    private ListNode endOfFirstHalf(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;

        /**
         * 快慢指针，执行 n/2次得到此时slow的位置为链表中间节点，并返回
         */
        while (fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }        
        return slow;
    }


    /**
     * 链表反转
     */
    private ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }
}
// @lc code=end

