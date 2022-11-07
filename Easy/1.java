import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {

        // Approach: Two Nest For Loops
        // Time Complexity: Quadratic ~ O(n^2)

        for (int i = 0; i < nums.length; i++) {

        int first_num = nums[i];

            for (int j = i + 1; j < nums.length; j++) {

            int second_num = nums[j];
            int tally = first_num + second_num;

                if (tally == target) {
                    return new int[] {i,j};
                }
            
            }
        }
        return null;
    }

    // Testing nums = [2,7,11,15], target = 9
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15},9)));
    }
    
}       