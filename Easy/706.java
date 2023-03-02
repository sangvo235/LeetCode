// Approach: Mapping Array
// Time Complexity: Linear ~ O(n)
// Space Complexity: O(n)

class MyHashMap {

    int[] mapArray;

    public MyHashMap() {
        // key between 0 to 10^6
        mapArray = new int[1000001];

        // Initialize all the arrays values with -1 because by default they are 0 in an
        // empty array
        Arrays.fill(mapArray, -1);
    }

    public void put(int key, int value) {
        mapArray[key] = value;
    }

    public int get(int key) {
        return mapArray[key];
    }

    public void remove(int key) {
        mapArray[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */