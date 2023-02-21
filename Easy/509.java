class Solution {

    public int fib(int n) {

        // Memoization
        int[] fibCache = new int[n + 1];

        if (n <= 1) { // base case
            return n;
        }

        if (fibCache[n] != 0) {
            return fibCache[n];
        }

        int nthFib = fib(n - 1) + fib(n - 2);
        fibCache[n] = nthFib;

        return nthFib;

    }
}