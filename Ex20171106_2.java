package com.company;

import java.util.Scanner;

public class Ex20171106_2 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        while (b > 9){
            b = scn.nextInt();
        }
        String sum = "";
        System.out.println(new StringBuilder(sum1(sum,a,b)).reverse().toString());
    }

    private static String sum1(String sum,int a,int b){
        if(a == 0){
            return sum;
        }
        else{
            return sum1(sum + a%b,a/b,b);
        }
    }
}
