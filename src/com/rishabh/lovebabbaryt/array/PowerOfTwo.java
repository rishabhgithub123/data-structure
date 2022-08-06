package com.rishabh.lovebabbaryt.array;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i  = sc.nextInt();
        int count = 0;
        while (i!=0) {
            if((i&1) == 1) {
                count++;
            }
            i = i>>1;
        }

        if(count == 1) {
            System.out.println("Number is power of 2");
        } else {
            System.out.println("Number is not power of 2");
        }
    }

}
