public class FibonacciComparison {

    // Recursive Fibonacci
    // Time Complexity: O(2^N)
    // Recalculates same values again and again
    // Very slow and memory heavy
    static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Iterative Fibonacci
    // Time Complexity: O(N)
    // Uses loop, no recursion
    // Fast and memory efficient
    static int fibIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}

/*
COMPARISON:
Recursive → Exponential time, not usable for large N
Iterative → Linear time, best approach
*/
