package com.company;

import java.util.Scanner;

public class Ex20171113_6 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] ine = new int[n][m];
        int[][] ine2 = new int[m][n];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                ine[i][j] = scn.nextInt();
            }
        }

        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                ine2[i][j] = ine[j][i];
                System.out.print(ine2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
