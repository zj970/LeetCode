#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
struct ListNode
{
	int val;
	struct ListNode *next;
};


int main()
{
	struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2);
	printf("这是一个测试\n");
	struct ListNode *First = NULL;
	struct ListNode *First1 = NULL;
	struct ListNode *First2 = NULL;

	struct ListNode *Second = NULL;
	struct ListNode *Second1 = NULL;
	struct ListNode *Second2 = NULL;
	struct ListNode *Third = NULL;


	First2 = First = malloc(sizeof(struct ListNode));
	Second2 = Second = malloc(sizeof(struct ListNode));
	Third = malloc(sizeof(struct ListNode));

	int first_size = 0;
	int second_size = 0;

	printf("%d/n",First);
	printf("请输入第一个链表的长度：");
	scanf("%d",&first_size);
	printf("请输入链表的数值：");
	for (int i=0; i < first_size; i++,First->next++)
	{
		scanf("%d", &First->val);
		First1 = malloc(sizeof(struct ListNode));
		First->next = First1;
		First = First1;
	}

	printf("请输入第二个链表的长度：");
	scanf("%d",&second_size);
	printf("请输入链表的数值：");
	for (int i=0; i < second_size; i++,Second->next++)
	{
		scanf("%d", &Second->val);
		Second1 = malloc(sizeof(struct ListNode));
		Second->next = Second1;
		Second = Second1;
	}
	Third = addTwoNumbers(First2,Second2);

	do
	{
		printf("%d", Third->val);
		Third = Third->next;
	}
	while(Third!=NULL);

	return 0;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
  struct ListNode *head = NULL, *tail = NULL;
    int carry = 0;
    while (l1 || l2) {
        int n1 = l1 ? l1->val : 0;
        int n2 = l2 ? l2->val : 0;
        int sum = n1 + n2 + carry;
        if (!head) {
            head = tail = malloc(sizeof(struct ListNode));
            tail->val = sum % 10;
            tail->next = NULL;
        } else {
            tail->next = malloc(sizeof(struct ListNode));
            tail->next->val = sum % 10;
            tail = tail->next;
            tail->next = NULL;
        }
        carry = sum / 10;
        if (l1) {
            l1 = l1->next;
        }
        if (l2) {
            l2 = l2->next;
        }
    }
    if (carry > 0) {
        tail->next = malloc(sizeof(struct ListNode));
        tail->next->val = carry;
        tail->next->next = NULL;
    }
    printf("zhixinfl");
    printf("%d",head->val);
    return head;
}

    
