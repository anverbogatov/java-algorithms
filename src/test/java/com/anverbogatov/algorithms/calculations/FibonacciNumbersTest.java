package com.anverbogatov.algorithms.calculations;

import junit.framework.TestCase;
import org.junit.Assert;

public class FibonacciNumbersTest extends TestCase {

    public void testCalculateForZero() {
        Assert.assertEquals(0, FibonacciNumbers.calculate(0));
    }

    public void testCalculateForOne() {
        Assert.assertEquals(1, FibonacciNumbers.calculate(1));
    }

    public void testCalculate() {
        Assert.assertEquals(3524578, FibonacciNumbers.calculate(33));
    }
}