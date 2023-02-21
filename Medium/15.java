class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Using Two Pointer Method O(n^2)

        // base case
        List<List<Integer>> result = new LinkedList<>();

        int n = nums.length;

        if (n < 3)
            return result;

        // sort array
        Arrays.sort(nums);

        // iterate the array
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            int L = i + 1, R = n - 1;

            while (L < R) {
                int curSum = nums[i] + nums[L] + nums[R];

                if (curSum == 0) {
                    List<Integer> sub = new LinkedList<>();
                    sub.add(nums[i]);
                    sub.add(nums[L]);
                    sub.add(nums[R]);
                    result.add(sub);

                    L++;
                    R--;

                    while (L < R && nums[L] == nums[L - 1]) {
                        L++;
                    }

                    while (L < R && nums[R] == nums[R + 1]) {
                        R--;
                    }
                } else if (curSum < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        // return the result
        return result;
    }
}