package com.rishabh.patterns;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i<=n) {
            int j=1;
            while (j<=n-i+1) {
                System.out.print("*");
                j++;
            }
            while (j<=n) {
                System.out.print("1");
                j++;
            }
            j = 0;
            while (j<i-1) {
                System.out.print("1");
                j++;
            }

            while (j<n) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
