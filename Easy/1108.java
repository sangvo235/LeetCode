// Approach: String Builder
// Time Complexity: Linear ~ O(n)
// Space Complexity: O(n)

class Solution {
    public String defangIPaddr(String address) {

        StringBuilder ns = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {

            if (address.charAt(i) == '.') {
                ns.append("[.]");
                i++;
            }
            ns.append(address.charAt(i));
        }
        return ns.toString();
    }
}