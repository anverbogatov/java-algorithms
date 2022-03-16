package com.anverbogatov.algorithms.tasks;

import java.util.HashSet;

public final class Task2 {

    /**
     * Check if given string contains only unique characters.
     * <p>
     * The algorithm of checking uses HashSet as auxiliary data structure because it's
     * capabilities of adding and checking size have complexity O(1). That means overall complexity of that algorithm
     * would be equal to O(n).
     *
     * @param str - string that need to be checked
     * @return true if given string contains only unique characters
     */
    public static boolean containsOnlyUniqueCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.length() == 1) {
            return true;
        }
        var set = new HashSet<Character>();
        for (var ch : str.toCharArray()) {
            set.add(ch);
        }
        return set.size() == str.length();
    }
}
