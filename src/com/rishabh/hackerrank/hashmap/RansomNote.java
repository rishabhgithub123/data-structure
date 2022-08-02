package com.rishabh.hackerrank.hashmap;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.Map.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here

        List<String> tempNote = new ArrayList<>(note);
        Map<String,Integer> magazineMap = new HashMap<>();
        for (String s : magazine) {
            if (magazineMap.containsKey(s)) {
                magazineMap.put(s, magazineMap.get(s) + 1);
            } else {
                magazineMap.put(s, 1);
            }
        }

        System.out.println(magazineMap);

        for (String s : note) {
            if (magazineMap.containsKey(s)) {
                if (magazineMap.get(s) > 0) {
                    magazineMap.put(s, magazineMap.get(s) - 1);
                    tempNote.remove(s);
                }
            }
        }

        if(tempNote.size() == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

public class RansomNote {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}

