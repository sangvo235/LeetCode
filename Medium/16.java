class Solution {
    public int threeSumClosest(int[] nums, int target) {

        // Sort Array
        Arrays.sort(nums);

        // Define gap, ans
        int gap = Integer.MAX_VALUE, ans = 0, n = nums.length;

        // iterations
        for (int i = 0; i < n; i++) {
            int L = i + 1;
            int R = n - 1;

            while (L < R) {
                int curSum = nums[L] + nums[R] + nums[i];
                if (curSum == target) {
                    return target;
                } else if (curSum < target) {
                    L++;
                } else {
                    R--;
                }

                int curGap = Math.abs(curSum - target);
                if (curGap < gap) {
                    gap = curGap;
                    ans = curSum;
                }
            }
        }

        // return the sum that has smallest gap between target and the sum
        return ans;

    }
}