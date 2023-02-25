// Time Complexity = O(n * klogk)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Use HashMap to group all the anagrams together
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Sort the string to get the key
            String key = generateKey(str);

            // Add the current string to the current table
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());

    }

    private String generateKey(String str) {
        char[] arr = str.toCharArry();
        Arrays.sort(arr);
        return new String(arr);
    }
}
