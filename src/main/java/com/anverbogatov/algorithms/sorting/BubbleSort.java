package com.anverbogatov.algorithms.sorting;

public class BubbleSort {

    /**
     * Sort given array of numbers using Bubble Sort algorithm.
     * The algorithm has complexity equals O(n^2).
     *
     * @param numbers - array of numbers that need to be sorted
     */
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                var cur = numbers[j];
                var next = numbers[j + 1];
                if (next < cur) {
                    numbers[j] = next;
                    numbers[j + 1] = cur;
                }
            }
        }
    }
}
