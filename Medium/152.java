class Solution {
    public int maxProduct(int[] nums) {

        // Set variables
        int N = nums.length;
        int min = nums[0];
        int max = nums[0];
        int result = nums[0];

        for (int i = 1; i < N; i++) {
            int temp_max = max;
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(temp_max * nums[i], min * nums[i]));

            result = Math.max(result, max);
        }
        return result;

        // O(N) time complexity and O(1) space complexity
    }
}