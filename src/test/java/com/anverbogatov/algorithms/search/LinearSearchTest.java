package com.anverbogatov.algorithms.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class LinearSearchTest {

    @Test
    public void testLinearSearchWithEmptyArray() {
        // given
        var numbers = new int[]{};
        // when
        var index = LinearSearch.linearSearch(numbers, 0);
        // then
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testLinearSearchWithSingleElementArrayHappy() {
        // given
        var numbers = new int[]{47};
        // when
        var index = LinearSearch.linearSearch(numbers, 47);
        // then
        Assert.assertEquals(0, index);
    }

    @Test
    public void testLinearSearchWithSingleElementArrayFailure() {
        // given
        var numbers = new int[]{47};
        // when
        var index = LinearSearch.linearSearch(numbers, 12);
        // then
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testLinearSearch() {
        // given
        var numbers = IntStream.range(1, 100).toArray();
        var n = 21;
        // when
        var index = LinearSearch.linearSearch(numbers, n);
        //then
        Assert.assertEquals(20, index);
    }
}