import java.util.HashMap;

public class TwoSum1 {

	public static void main(String[] args) {
		int[] nums = {3,3};
		int target = 6;
		int[] solution = twoSum(nums, target);
		System.out.println(solution[0]);
		System.out.println(solution[1]);

	}
	
	static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				for(int k = 0; k < nums.length ; k++) {
					if(nums[k] == target - nums[i]) {
						int[] sol = {i,k};
						return sol;
					}
				}
			}
			map.put(nums[i], target - nums[i]);
		}
		return null;
	}

}
