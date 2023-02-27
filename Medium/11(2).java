// Approach: Two Pointers
// Time Complexity: Linear ~ O(n)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {

        // declare length of input / max index
        int n = height.length;

        // declare pointers
        int left = 0;
        int right = n - 1;

        // declare current area and max area
        int area = 0;
        int max = 0;

        while (left < right) {
            // caculate shorter bar length
            int shorterBar = Math.min(height[left], height[right]);

            // calculate maximum area
            max = Math.max(max, shorterBar * (right - left));

            // increment/decrement the bars
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}