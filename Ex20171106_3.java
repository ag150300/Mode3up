package com.company;

import java.util.Scanner;

public class Ex20171106_3 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int depot = 0;
        int sum = 0;
        while (a > 1 && b >= 1){
            int ag = a;
            int bg = b;
            int ab = a-b;
            for(int i = a;i >= 2;i--){
               ag = ag*(i-1);
            }
            for(int i = b;i >= 2;i--){
                bg = bg*(i-1);
            }
            for(int i = a-b;i >= 2;i--){
                ab = ab*(i-1);
            }
            sum = sum + (ag/(bg*ab)) ;
//            System.out.println(ag);
//            System.out.println(bg);
//            System.out.println(ab);
            a--;
            b--;
        }
        System.out.println(sum);
    }
}
