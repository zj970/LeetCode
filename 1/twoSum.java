import java.util.Scanner;

public class twoSum {
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		String n;

	}
	public int[] two(int[] nums, int target) {
		Map<Integer, Integer> hashtable = HashMap<Integer, Integer>():
		for (int i = 0; i < nums.length; ++i) {
			if (hashtable.containsKey(target - nums[i])) {
				return new int[] {hashtable.get(target -nums[i], i};
			}
			hashtable.put(nums[i], i);
		}
		return new int[0];
	}
}
