class Solution {

    // Kadane's Alogrithm
    // Time Complexity = O(n)

    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (sum < 0) {
                sum = nums[i];
            } else {
                sum = sum + nums[i];
            }

            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    // Testing nums = [5,4,-1,7,8]
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] { 5, 4, -1, 7, 8 }));
    }
}