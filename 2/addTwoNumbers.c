#include <stdio.h>

int main()
{
	struct ListNode
	{
		int val;
		struct ListNode *next;
	};

	//struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2);
	printf("这是一个测试\n");

	return 0;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2)
{
	struct ListNode* l3;
	int i = 0;
	int j = 0;
	
	for (; l1->next++;i++) ;
	for (; l2->next++;j++) ;
	if (i < j)
	{
		while(l1->next--)
		{
			l3->val += l1->val + l2->val;
			l2->next--;
			if(l3->next > 10)
			{
				l3->val /=10;
				l3->next++;
				l3->val = 1;
			}else
			{
				l3->next++;
			}
		}
		while(l2->next--)
		{
			l3->next++;
			l3->val = l2->val;
		}
	}else
	{

		while(l2->next--)
		{
			l3->val += l1->val + l2->val;
			l1->next--;
			if(l3->next > 10)
			{
				l3->val /=10;
				l3->next++;
				l3->val = 1;
			}else
			{
				l3->next++;
			}
		}
		while(l1->next--)
		{
			l3->next++;
			l3->val = l2->val;
		}
	}

	return l3;

}
