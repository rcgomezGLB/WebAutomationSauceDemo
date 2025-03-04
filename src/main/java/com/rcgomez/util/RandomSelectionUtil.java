package com.rcgomez.util;

import java.util.*;

public class RandomSelectionUtil {

    public static <T> List<T> randomSelect(List<T> list, int n) {
        if (list == null || list.isEmpty() || n <= 0) {
            return new ArrayList<>(); // Return an empty list for invalid input
        }

        List<T> mutableList = new ArrayList<>(list);
        Collections.shuffle(mutableList);

        // Ensure that we do not select more elements than are available
        int numElementsToSelect = Math.min(n, mutableList.size());

        // Select the first 'numElementsToSelect' elements from the shuffled list
        return new ArrayList<>(mutableList.subList(0, numElementsToSelect));
    }
}
