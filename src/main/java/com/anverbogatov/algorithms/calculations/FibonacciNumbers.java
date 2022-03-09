package com.anverbogatov.algorithms.calculations;

public final class FibonacciNumbers {

    /**
     * Naive implementation of Fibonnacci numbers calculation.
     * Recursion-based approach.
     * Complexity is O(2^n).
     *
     * @param n - starting number
     * @return sum of Fibonnaci numbers
     */
    public static int calculate(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calculate(n - 1) + calculate(n - 2);
    }
}
