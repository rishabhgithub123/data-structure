package com.rishabh.lex;

import java.util.HashMap;
import java.util.Scanner;

public class EqualOccurrence {

    public static void main(String[] args) {
        String str = "abcaacbccb";
        int occur = 3;

        char[] chars = new char[256];

        for (int i = 0; i < str.length(); i++) {
            if(chars[str.charAt(i)] < occur) {
                chars[str.charAt(i)]++;
            }
        }
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(chars[str.charAt(i)] > 0) {
                temp.append(str.charAt(i));
                chars[str.charAt(i)]--;
            }
        }

        System.out.println(temp);

    }

}
