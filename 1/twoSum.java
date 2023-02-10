import java.util.Scanner;
import java.util.*;


public class twoSum {
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		//int nums[] = new int[100];
		int targets[] = new int[2];
		int numSize;
		int target;
		
		System.out.printf("请输入数组大小：");
		scanner.useDelimiter("\\s+");
		
		numSize = scanner.nextInt();

		System.out.println("请输入数组：");

		int nums[] = new int[numSize];

		for (int i = 0; i<nums.length; i++)
		{
			nums[i] = scanner.nextInt();
		}
		System.out.println("请输入target值： ");
		target = scanner.nextInt();
		
		targets = two(nums, target);
		System.out.println("下标为:"+Arrays.toString(targets));
		

	}
	//哈希表
	public static int[] two(int[] nums, int target) {
		Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; ++i) {
			if (hashtable.containsKey(target - nums[i])) {
				return new int[] {hashtable.get(target-nums[i]), i};
			}
			hashtable.put(nums[i], i);
		}
		return new int[0];
	}
	//暴力枚举
	/*
	 public int[] twoSum(int[] nums, int target){
	 int n = nums.length;
	 for (int i = 0; i <  n; ++i){
		for (int j = i+1; j < n; ++j){
			if (nums[i] + nums[j] == target){
			return new int[]{i, j};
			}
		}
	 }
	 return new int[0];
	 }
	  */
	
}
