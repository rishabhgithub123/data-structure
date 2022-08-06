package com.rishabh.lovebabbaryt.array;

public class SwapAlternate {
    public static void main(String[] args) {
        int[] arr = {1,2,8,7,5,6};
        swapAlternate(arr, 6);
    }

    private static void swapAlternate(int[] arr, int size) {

        for (int i = 0; i < size; i+=2) {
            if(i+1 < size) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
