package com.rishabh.lovebabbaryt.array;

public class MyArray {

    public static void main(String[] args) {

        int[] arrayList = new int[10];
        arrayList[0] = 1;
        arrayList[1] = 2;
        arrayList[2] = 3;
        arrayList[3] = 4;

        for(int i=0; i<arrayList.length;i++) {
            System.out.print(arrayList[i]);
        }

        updateArray(arrayList);

        for(int i=0; i<arrayList.length;i++) {
            System.out.print(arrayList[i]);
        }


    }


    public static void updateArray(int[] arrayList) {
        arrayList[2] = 10;
    }

}
