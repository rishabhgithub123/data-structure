package com.rishabh.lovebabbaryt.array;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i  = sc.nextInt();

        if((i&1) == 0) {
            System.out.println(i +" is Even");
        } else {
            System.out.println(i +" is Odd");
        }

    }

}
