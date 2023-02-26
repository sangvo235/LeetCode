// Approach: Linear Search
// Time Complexity: Linear ~ O(n)
// Space Complexity: O(1)

class Solution {
    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            int value = nums[i];

            if (value == target) {
                return i;
            }
        }
        return -1;
    }
}