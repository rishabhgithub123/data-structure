package com.rishabh.lovebabbaryt.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(nums);

        System.out.println(result);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int[] count = new int[n+2];
        for(int i=1;i<=n;i++) {
            count[nums[i-1]]++;
        }
        for(int i=1;i<=n;i++) {
            if(count[i] == 2) {
                result.add(i);
            }
        }

        return result;
    }
}
