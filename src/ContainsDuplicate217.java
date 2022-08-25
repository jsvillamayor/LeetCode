import java.util.HashMap;

public class ContainsDuplicate217 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,4};
		System.out.println(containsDuplicate(nums));
	}
	
	static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int temp : nums) {
			if(map.containsKey(temp))
				return true;
			map.put(temp, null);
		}
		return false;
	}

}
