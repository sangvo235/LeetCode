// Approach: Mapping
// Time Complexity: Linear O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Constraints that s & t consist of any valid ascii character

        // Create two maps - s & t
        int[] arr_s = new int[256];
        int[] arr_t = new int[256];

        for (int i = 0; i < s.length(); i++) {
            // Retrieve character at i
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);

            if (arr_s[char_s] == 0) {
                arr_s[char_s] = char_t;
            }

            if (arr_t[char_t] == 0) {
                arr_t[char_t] = char_s;
            }

            if (arr_s[char_s] != char_t || arr_t[char_t] != char_s) {
                return false;
            }
        }
        return true;
    }
}