
    import java.util.HashMap;
import java.util.Map;
    public class class2 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> complementMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (complementMap.containsKey(complement)) {
                    return new int[] { complementMap.get(complement), i };
                }
                complementMap.put(nums[i], i);
            }
            return new int[0];
        }
    }
}

