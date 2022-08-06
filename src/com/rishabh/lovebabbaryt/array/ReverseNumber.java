package com.rishabh.lovebabbaryt.array;

public class ReverseNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,7,9,-21,12,100};
        int j = arr.length - 1;
        int i = 0;

        while (i<=j) {
            int temp = arr[i];
            arr[i] = arr[j-i];
            arr[j-i] = temp;
            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
