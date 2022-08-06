package com.rishabh.lovebabbaryt.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUniqueOccurrence {

    public static void main(String[] args) {

        int[] arr = {4,4,1,2,1,1};
        System.out.println(uniqueOccurrences(arr));

    }


    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();

    }

}
