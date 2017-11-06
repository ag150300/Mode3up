package com.company;

import java.util.Scanner;

public class Ex20171106_1 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = 0;
        System.out.println(sum(n,a));
    }

    private static int sum(int n,int a){
        if(a == 0){
            return n;
        }
        else{
            return sum(n+1,a/10);
        }
    }
}
