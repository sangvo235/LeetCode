class Solution {
    public int[] productExceptSelf(int[] nums) {
        // You must write an algorithm that runs in O(n) time and without using the
        // division operation.
        int N = nums.length;

        int[] output_arr = new int[N];

        output_arr[0] = 1;

        // Can you solve the problem in O(1) extra space complexity? (The output array
        // does not count as extra space for space complexity analysis.)

        for (int i = 1; i < N; i++) {
            output_arr[i] = nums[i - 1] * output_arr[i - 1];
        }

        int R = 1;

        for (int i = N - 1; i >= 0; i--) {
            output_arr[i] = output_arr[i] * R;
            R = R * nums[i];
        }

        return output_arr;
    }
}