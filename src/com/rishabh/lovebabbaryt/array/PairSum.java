package com.rishabh.lovebabbaryt.array;

import java.util.ArrayList;

public class PairSum {

    public static void main(String[] args) {

        int[] arr = {2,-3,3,3,-2};
        System.out.println(pairSum(arr, 0));

    }
    public static ArrayList<ArrayList<Integer>> pairSum(int arr[], int sum) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(Math.min(arr[i], arr[j]));
                    temp.add(Math.max(arr[i], arr[j]));
                    result.add(temp);
                }
            }
        }
        return result;

    }

}
