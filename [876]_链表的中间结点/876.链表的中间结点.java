/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
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
    /**
     * 使用快慢指针的方式寻找
     */
    public ListNode middleNode(ListNode head) {
        
        //判断是否只有一个元素，false为两个元素以上,true 表示只有一个元素
        if(head.next != null)
        {
            //判断是否只有两个元素，true 表示只有两个元素，false为两个元素以上
            if(head.next.next == null)
            {
                return head.next;//返回最后一个元素
            }
            ListNode fast = head.next;//初始化快指针
            while(fast.next.next != null)//表示快指针未走完
            {
                head = head.next;//走一个元素
                fast = fast.next.next;//走两个元素
                if(fast.next == null)//偶数下一个为null
                {
                    break;//终止
                }
            }
        }else{
            //返回当前元素
            return head;
        }
        return head.next;//返回当前元素的下一个，因为初始化fast多走了一个
    }
}
// @lc code=end

