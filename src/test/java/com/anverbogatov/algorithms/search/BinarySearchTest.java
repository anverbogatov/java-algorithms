package com.anverbogatov.algorithms.search;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.stream.IntStream;

public class BinarySearchTest extends TestCase {

    public void testBinarySearchWithEmptyArray() {
        // given
        var numbers = new int[]{};
        // when
        var index = BinarySearch.binarySearch(numbers, 0);
        // then
        Assert.assertEquals(-1, index);
    }

    public void testBinarySearchWithSingleElementArrayHappy() {
        // given
        var numbers = new int[]{47};
        // when
        var index = BinarySearch.binarySearch(numbers, 47);
        // then
        Assert.assertEquals(0, index);
    }

    public void testBinarySearchWithSingleElementArrayFailure() {
        // given
        var numbers = new int[]{47};
        // when
        var index = BinarySearch.binarySearch(numbers, 12);
        // then
        Assert.assertEquals(-1, index);
    }

    public void testBinarySearch() {
        // given
        var numbers = IntStream.range(1, 100).toArray();
        var n = 21;
        // when
        var index = BinarySearch.binarySearch(numbers, n);
        //then
        Assert.assertEquals(20, index);
    }
}