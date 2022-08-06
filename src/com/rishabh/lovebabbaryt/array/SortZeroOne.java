package com.rishabh.lovebabbaryt.array;

import java.util.Arrays;

public class SortZeroOne {

    public static void main(String[] args) {

        int[] arr = {0,1,0,1,0,1};
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            while(arr[start]==0 && start<end) {
                start++;
            }
            while(arr[end]==1 && start<end) {
                end--;
            }
            if(start<end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
