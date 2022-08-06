package com.rishabh.lovebabbaryt.array;

public class FindUnique {

    public static void main(String[] args) {
        int[] arr = {2,4,7,2,7};
        findUnique(arr, arr.length);
    }
    private static void findUnique(int[] arr, int size) {

        int ans = 0;
        for(int i=0; i<size; i++) {
            ans ^= arr[i];
        }

        System.out.println(ans);

    }
}
