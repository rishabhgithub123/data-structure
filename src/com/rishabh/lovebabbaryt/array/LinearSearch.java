package com.rishabh.lovebabbaryt.array;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,2,7,9,-21,12,100};

        if(searchElement(arr,7,11)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

    }

    public static boolean searchElement(int[] arr, int size, int key) {
        for (int i = 0; i < size; i++) {
            if(arr[i] == key) {
                return true;
            }
        }
        return false;
    }

}
