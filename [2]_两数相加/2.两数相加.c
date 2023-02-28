/*
 * @lc app=leetcode.cn id=2 lang=c
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* dummy = malloc(sizeof(struct ListNode));
    struct ListNode* cur = dummy;
    int sum = 0;
    while(l1 || l2 || sum){
        if(l1)
        {
            sum += l1->val;
            l1=l1->next;
        } 
        if(l2)
        {
            sum += l2->val;
            l2=l2->next;
        } 
        cur->next = malloc(sizeof(struct ListNode));
        cur->next->val = sum%10;
        cur->next->next = NULL;
        cur = cur->next;
        sum /= 10;
    }
    return dummy->next;
}

// @lc code=end
