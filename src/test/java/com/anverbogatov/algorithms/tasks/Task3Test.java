package com.anverbogatov.algorithms.tasks;

import junit.framework.TestCase;
import org.junit.Assert;

public class Task3Test extends TestCase {

    public void testNull() {
        Assert.assertEquals(0, Task3.maxAmountOfConsecutiveElements(null));
    }

    public void testSingleElement() {
        Assert.assertEquals(1, Task3.maxAmountOfConsecutiveElements(new int[]{1}));
    }

    public void testAlgorithmWithSingleSequence() {
        Assert.assertEquals(3, Task3.maxAmountOfConsecutiveElements(new int[]{10, 15, 2, 2, 2, 3, 7}));
    }

    public void testAlgorithmWithMultipleSequence() {
        Assert.assertEquals(4, Task3.maxAmountOfConsecutiveElements(new int[]{10, 15, 2, 2, 2, 3, 7, 1, 1, 7, 7, 7, 7, 11, 2, -4}));
    }
}