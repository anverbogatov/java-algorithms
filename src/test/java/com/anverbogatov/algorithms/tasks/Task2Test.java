package com.anverbogatov.algorithms.tasks;

import org.junit.Assert;
import org.junit.Test;

public class Task2Test {

    @Test
    public void containsOnlyUniqueCharactersWithNull() {
        Assert.assertFalse(Task2.containsOnlyUniqueCharacters(null));
    }

    @Test
    public void containsOnlyUniqueCharactersWithEmptyString() {
        Assert.assertFalse(Task2.containsOnlyUniqueCharacters(""));
    }

    @Test
    public void containsOnlyUniqueCharactersWithBlank() {
        Assert.assertTrue(Task2.containsOnlyUniqueCharacters(" "));
    }

    @Test
    public void containsOnlyUniqueCharactersWithUniqueCharacters() {
        Assert.assertTrue(Task2.containsOnlyUniqueCharacters("drones"));
    }

    @Test
    public void containsOnlyUniqueCharactersWithNonUniqueCharacters() {
        Assert.assertFalse(Task2.containsOnlyUniqueCharacters("capital"));
    }
}