package com.company;

import java.util.Scanner;

public class Ex20171113_4 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int sum = 0;

        for(int i = 3;i <= N;i=i+3){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
