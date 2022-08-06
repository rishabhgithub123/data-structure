package com.rishabh.lovebabbaryt.array;

import java.util.ArrayList;

public class TripletsSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(pairSum(arr, 12));

    }
    public static ArrayList<ArrayList<Integer>> pairSum(int arr[], int sum) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if((arr[i] + arr[j] + arr[k]) == sum) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        result.add(temp);
                    }
                }
            }
        }
        return result;

    }
}
