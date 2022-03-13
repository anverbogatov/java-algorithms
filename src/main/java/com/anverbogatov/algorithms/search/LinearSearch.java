package com.anverbogatov.algorithms.search;

/**
 * This class shows simple implementation of a linear search algorithm.
 */
public final class LinearSearch {

    public static final int NOT_FOUND = -1;

    /**
     * Search specific number in a given array of numbers using linear search algorithm.
     * Linear search algorithm has O(n) complexity.
     *
     * @param numbers - given array of numbers in which search will be performed
     * @param value   - given value that must be found in the array
     * @return index of the value in provided array or '-1' if not found
     */
    public static int linearSearch(int[] numbers, int value) {
        if (numbers.length == 0) {
            return NOT_FOUND;
        }

        for (int i = 0; i < numbers.length; i++) {
            var el = numbers[i];
            if (el == value) {
                return i;
            }
        }
        return NOT_FOUND;
    }
}
