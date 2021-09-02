#include <stdio.h>

int main()
{
	struct ListNode
	{
		int val;
		struct ListNode *next;
	};

	struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2);
	printf("这是一个测试\n");
	struct ListNode* First;
	struct ListNode* Second;
	struct ListNode* Third;

	int first_size = 0;
	int second_size = 0;

	First->next=NULL;
	Second->next=NULL;
	Third->next=NULL;

	printf("请输入第一个链表的长度：");
	scanf("%d",&first_size);
	printf("请输入链表的数值：");
	for (int i=0; i < first_size; i++,First->next++)
	{
		scanf("%d",First->val);
	}

	printf("请输入第二个链表的长度：");
	scanf_s("%d",&second_size);
	printf("请输入链表的数值：");
	for (int i=0; i < second_size; i++,Second->next++)
	{
		scanf_s("%d",Second->val);
	}
	Third = addTwoNumbers(First,Second);
	
	while(Third->next)
	{
		printf("%d-->",Third->val);
	}


	return 0;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2)
{

	struct ListNode *head = NULL, *tail = NULL;
	int carry = 0;
	while (l1 | l2)
	{
		int n1 = l1 ? l1->val : 0;
		int n2 = l2 ? l2->val : 0;
		int sum = n1 + n2 + carry;
		if (!head)
		{
			head = tail = malloc(sizeof(struct ListNode));
			tail->val = sum % 10;
			tail->next = NULL;
		}
		else
		{
			tail->next = malloc(sizeof(struct ListNode));
			tail->next->val = sum % 10;
			tail = tail->next;
			tail->next = NULL;
		}
		carry = sum /10;
		if (l1)
		{
			l1 = l1->next;
		}

		if (l2)
		{
			l2 = l2->next;
		}
	}
}
