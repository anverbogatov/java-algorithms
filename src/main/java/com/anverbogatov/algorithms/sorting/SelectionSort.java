package com.anverbogatov.algorithms.sorting;

public class SelectionSort {

    /**
     * Sort given array of numbers using Selection Sort algorithm.
     * The algorithm has complexity equals O(n^2).
     *
     * @param numbers - array of numbers that need to be sorted
     */
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (i != j && numbers[j] < numbers[i]) {
                    var temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
