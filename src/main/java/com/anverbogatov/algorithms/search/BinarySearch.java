package com.anverbogatov.algorithms.search;

/**
 * This class contains methods that implement commonly used and
 * widely known search algorithms.
 */
public final class BinarySearch {

    public static final int NOT_FOUND = -1;

    /**
     * Search specific number in a given array of numbers using binary search algorithm.
     * Binary search algorithm has O(log n) complexity.
     *
     * @param numbers - given array of numbers in which search will be performed
     * @param value   - given value that must be found in the array
     * @return index of the value in provided array or '-1' if not found
     */
    public static int binarySearch(int[] numbers, int value) {
        if (numbers.length == 0) {
            return NOT_FOUND;
        }

        var low = 0;
        var high = numbers.length;

        while (true) {
            var mid = (high + low) / 2;
            var temp = numbers[mid];
            if (temp == value) {
                return mid;
            } else if (low == high) {
                if (numbers[0] == value) {
                    return 0;
                } else {
                    return NOT_FOUND;
                }
            } else if (value < temp) {
                high = mid;
            } else {
                low = mid;
            }
        }
    }
}
