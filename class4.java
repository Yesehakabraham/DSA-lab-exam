public class class4 {
        public int findMaximum(int[] nums) {
            if (nums == null || nums.length == 0) {
                System.out.println("Array is empty.");
                return -1;
            }
            int max = nums[0]; // Assume the first element is the maximum

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i]; // Update the maximum if a larger element is found
                }
            }

            return max;
        }
    }
}
