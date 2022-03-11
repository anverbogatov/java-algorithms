package com.anverbogatov.algorithms.tasks;

import java.util.HashSet;

public final class Task1 {

    /**
     * Find if any of two numbers in the given array add up to given `sum`.
     * Time complexity of the algorithm used here is O(n^2).
     *
     * @param numbers - given array of numbers
     * @param sum     - given sum
     * @return `true` if two numbers in the given array add up to `sum`
     */
    public static boolean isSumExist(int[] numbers, int sum) {
        for (int i = 0; i < numbers.length; i++) {
            int firstNum = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                int secondNum = numbers[j];
                if (i == j) {
                    continue;
                }
                if (firstNum + secondNum == sum) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Find if any of two numbers in the given array add up to given `sum`.
     * Time complexity of the algorithm used here is O(n) and that is better than another version in the class.
     *
     * @param numbers - given array of numbers
     * @param sum     - given sum
     * @return `true` if two numbers in the given array add up to `sum`
     */
    public static boolean isSumExistBonus(int[] numbers, int sum) {
        // todo: re-check
        if (numbers.length <= 1) {
            return false;
        }
        /*
         I'm using memoization here to store temporary data.
         Since both operations - add & contains on HashSets have O(1) complexity,
         we can do all calculations we need in one iteration on a given array.
         */
        var temp = new HashSet<Integer>(numbers.length);
        for (var num : numbers) {
            temp.add(num);
            if (temp.contains(sum - num)) {
                return true;
            }
        }

        return false;
    }


}
