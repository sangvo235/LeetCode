class Solution {
    public int[][] merge(int[][] intervals) {

        // base case
        int n = intervals.length;
        if (n == 1)
            return intervals;

        // sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // define stack
        Stack<int[]> stack = new Stack<>();

        // add first interval onto the stack
        stack.add(intervals[0]);

        // merge intervals
        for (int i = 1; i < n; i++) {
            int[] pre = stack.peek();
            int[] cur = intervals[i];

            // check if they are overlapping
            if (pre[1] < cur[0]) {
                stack.add(cur);
            } else {
                pre[1] = Math.max(cur[1], pre[1]);
            }
        }
        // return list
        return stack.toArray(new int[stack.size()][2]);
    }
}