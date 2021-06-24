#include <stdio.h>

int main()
{
	int nums[100];
	int num_size, i;
	int target;
	int return_size[2];
	int twoSum(int* nums, int numSize, int target, int* returnSize);
	printf("Please input num_size:");
	scanf("%d", &num_size);

	//赋值数组
	printf("Please input %d nums:", num_size);
	for (i = 0; i < num_size; i++)
	{
		scanf("%d", &nums[i]);
	}
	/*for (i = 0; i < num_size; i++)
	{
		printf("%d\t", nums[i]);
	}*/

	printf("Please input target : ");
	scanf("%d", &target);
	twoSum(nums, num_size, target, return_size);
	printf("The subscript of these two numbers is [%d, %d]", return_size[0], return_size[1]); 
	return 0;
}

int twoSum(int* nums, int numSize, int target, int* returnSize)
{
	int *maps;
	int i, j;
	maps = nums;
	printf("%d", *maps);
	for (i = 1; i < numSize; i++,nums++)
	{
		for (j = 0; j < i; j++)
		{
			if( (target - *(nums+i)) == *(maps+j) )
			{
				*returnSize = i;
				*(returnSize+1) = j;
				break;
			}
		}
		maps = nums;
	}
	return 0;
}
