// Approach: Hash Map
// Time Complexity: O(1) * O(2*n) -> Linear O(n)
// Space Complexity: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Cache the value and their index
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            // Search in hashmap for the difference conditional that it is not the index
            if (hm.containsKey(diff) && hm.get(diff) != i) {
                return new int[] { i, hm.get(diff) };
            }
        }

        // Can't find result
        return null;

    }
}