// Approach: Brute Force
// Time Complexity: Quadratic ~ O(n^2)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {

        int area = 0;
        int max = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                area = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}