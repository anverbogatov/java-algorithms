package com.anverbogatov.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void sortEmpty() {
        // given
        var numbers = new int[]{};
        // when
        BubbleSort.sort(numbers);
        // then
        assertArrayEquals(new int[]{}, numbers);
    }

    @Test
    public void sortSingle() {
        // given
        var numbers = new int[]{1};
        // when
        BubbleSort.sort(numbers);
        // then
        assertArrayEquals(new int[]{1}, numbers);
    }

    @Test
    public void sort() {
        // given
        var numbers = new int[]{10, 15, 3, 7, 9, 2, 4, 5};
        // when
        BubbleSort.sort(numbers);
        // then
        System.out.println("[Bubble sort]: = " + Arrays.toString(numbers));
        assertArrayEquals(new int[]{2, 3, 4, 5, 7, 9, 10, 15}, numbers);
    }
}