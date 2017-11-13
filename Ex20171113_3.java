package com.company;

import java.util.Scanner;

public class Ex20171113_3 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = 0;

        for(int i = 2;i < a;i++){
            if(a % i == 0){
                n++;
            }
        }
        if(n > 0){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
