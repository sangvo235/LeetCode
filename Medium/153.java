// Condition: You must write an algorithm that runs in O(log n) time.

// Approach: Binary Search
// Time Complexity: Logarithmic ~ O(logn)
// Space Complexity: O(1)

class Solution {
    public int findMin(int[] nums) {

        // Initialise length of array
        int n = nums.length;

        // Initialise pointers
        int L = 0;
        int R = n - 1;

        if (nums[L] < nums[R])
            return nums[L];

        while (L + 1 < R) {
            int mid = L + (R - L) / 2;

            if (nums[mid] > nums[R]) {
                L = mid;
            } else {
                R = mid;
            }
        }
        return Math.min(nums[L], nums[R]);
    }
}
