package com.rishabh.lex;

import java.util.Scanner;

/*
5
TTTWW
TWWTT
TWWTT
TWTTT
WWTTT

*/

public class MaxTree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        char[][] treeWaterMap = new char[size][size];

        for(int i=0; i<size; i++) {
            char[] strings = sc.nextLine().toCharArray();
            int j=0;
            for (char c: strings) {
                treeWaterMap[i][j] = c;
                j++;
            }
        }

        int max = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(treeWaterMap[i][j] == 'T') {
                    int count = depthSearch(i,j,treeWaterMap,size);
                    max = Math.max(max, count);
                }
            }
        }

        if(max>0) {
            System.out.println(max);
        } else {
            System.out.println(-1);
        }
    }

    public static int depthSearch(int x, int y, char[][] treeWaterMap, int size) {
        int count = 1;
        treeWaterMap[x][y] = 'V';
        int[] rows = new int[]{0,1,0,-1};
        int[] column = new int[]{1,0,-1,0};
        for (int i = 0; i < rows.length; i++) {
            if(canMove(x+rows[i], y+column[i], treeWaterMap, size)) {
                count += depthSearch(x+rows[i], y+column[i], treeWaterMap, size);
            }
        }
        return count;
    }

    public static boolean canMove(int v1, int v2, char[][] treeWaterMap, int size) {
        if(v1>=0 && v2>=0 && v1<size && v2<size) {
            return treeWaterMap[v1][v2] == 'T';
        }
        return false;
    }

}
