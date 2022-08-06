package com.rishabh.lovebabbaryt.array;


public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {5,1,2,2,4,3};

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            ans ^= i;
        }

        System.out.println(ans);
    }

}
