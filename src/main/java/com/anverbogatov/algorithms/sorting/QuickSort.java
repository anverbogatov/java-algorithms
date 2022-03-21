package com.anverbogatov.algorithms.sorting;

public class QuickSort {
    /**
     * Sort given array of numbers using Quick Sort algorithm.
     * The algorithm has complexity equals O(n * log n).
     *
     * @param numbers - array of numbers that need to be sorted
     */
    public static void sort(int[] numbers) {
        if (numbers.length < 2) return;
        sort(numbers, 0, numbers.length - 1);
    }

    private static void sort(int[] numbers, int low, int high) {
        if (high <= low) return;
        var pivot = partition(numbers, low, high);
        sort(numbers, low, pivot - 1);
        sort(numbers, pivot + 1, high);
    }

    private static int partition(int[] numbers, int low, int high) {
        var i = low;
        var j = high + 1;
        var pivotEl = numbers[low];
        while (true) {
            while (numbers[++i] < pivotEl) if (i == high) break;
            while (pivotEl < numbers[--j]) if (j == low) break;
            if (i >= j) break;
            swap(numbers, i, j);
        }
        swap(numbers, low, j);
        return j;
    }

    private static void swap(int[] numbers, int i, int j) {
        var temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
