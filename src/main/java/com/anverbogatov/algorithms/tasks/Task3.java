package com.anverbogatov.algorithms.tasks;

import java.util.HashSet;

public final class Task3 {

    /**
     * Calculate amount of consecutive elements in a given array.
     *
     * @param arr - array that need to be checked
     * @return number of consecutive elements
     */
    public static int maxAmountOfConsecutiveElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        if (arr.length == 1) {
            return 1;
        }

        int result = 0;
        int leftIndex = 0;

        for (; leftIndex < arr.length - 1; leftIndex++) {
            int rightIndex = leftIndex;

            for (; rightIndex < arr.length; rightIndex++) {
                if (arr[leftIndex] != arr[rightIndex]) {
                    break;
                }
            }

            result = Math.max(result, rightIndex - leftIndex);
        }
        return result;
    }
}
