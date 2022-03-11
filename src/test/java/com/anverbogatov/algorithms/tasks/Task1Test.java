package com.anverbogatov.algorithms.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class Task1Test {

    @Test
    public void isSumExistOnEmptyArray() {
        // given
        var numbers = new int[]{};
        var sum = 17;
        // when
        var result = Task1.isSumExist(numbers, sum);
        // then
        Assert.assertFalse(result);
    }

    @Test
    public void isSumExistOnSingleElementArray() {
        // given
        var numbers = new int[]{17};
        var sum = 17;
        // when
        var result = Task1.isSumExist(numbers, sum);
        // then
        Assert.assertFalse(result);
    }

    @Test
    public void isSumExist() {
        // given
        var numbers = new int[]{10, 15, 3, 7};
        var sum = 17;
        // when
        var result = Task1.isSumExist(numbers, sum);
        // then
        Assert.assertTrue(result);
    }

    @Test
    public void isSumExistNegative() {
        // given
        var numbers = new int[]{10, 15, 3, 7};
        var sum = 19;
        // when
        var result = Task1.isSumExist(numbers, sum);
        // then
        Assert.assertFalse(result);
    }


    @Test
    public void isSumExistOnEmptyArrayBonus() {
        // given
        var numbers = new int[]{};
        var sum = 17;
        // when
        var result = Task1.isSumExistBonus(numbers, sum);
        // then
        Assert.assertFalse(result);
    }

    @Test
    public void isSumExistOnSingleElementArrayBonus() {
        // given
        var numbers = new int[]{17};
        var sum = 17;
        // when
        var result = Task1.isSumExistBonus(numbers, sum);
        // then
        Assert.assertFalse(result);
    }

    @Test
    public void isSumExistBonus() {
        // given
        var numbers = new int[]{10, 15, 3, 7};
        var sum = 17;
        // when
        var result = Task1.isSumExistBonus(numbers, sum);
        // then
        Assert.assertTrue(result);
    }

    @Test
    public void isSumExistNegativeBonus() {
        // given
        var numbers = new int[]{10, 15, 3, 7};
        var sum = 19;
        // when
        var result = Task1.isSumExistBonus(numbers, sum);
        // then
        Assert.assertFalse(result);
    }

    @Test
    public void isSumExistPerformanceLog() {
        // given
        var numbers = IntStream.range(0, 10000).toArray();
        var sum = 9451;
        // when
        var _start = System.nanoTime();
        var result1 = Task1.isSumExist(numbers, sum);
        System.out.println("Original: " + (System.nanoTime() - _start));
        _start = System.nanoTime();
        var result2 = Task1.isSumExistBonus(numbers, sum);
        System.out.println("Bonus: " + (System.nanoTime() - _start));
        // then
        Assert.assertEquals(result1, result2);
    }
}