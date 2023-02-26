// Approach: Binary Search
// Time Complexity: Logarithmic ~ O(logn)
// Space Complexity: O(1)

class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length, low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // If low <= mid then when know it is in ascending order
            if (nums[low] <= nums[mid]) {
                // Check if target is between low and mid
                if (target >= nums[low] && target < nums[mid]) {
                    // assign high as mid - 1 if this condition is true
                    high = mid - 1;
                } else { // must be between mid and high...
                    low = mid + 1;
                }
            } else { // if low > mid
                if (target <= nums[high] && target > nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}