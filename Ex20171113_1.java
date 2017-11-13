package com.company;

import java.util.Scanner;

public class Ex20171113_1 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int c1 = 0;
        int c2 = 0;
        int sum;
        if(b2 < a2){
            b2 = b2+60;
            b1 = b1-1;
        }

        c1 = b1 - a1;
        c2 = b2 - a2;

        if(c1 <= 2){
            c1 = c1*2;
            c2 = c2/30;
            sum = (c1 + c2)*30;
            System.out.println(sum);
        }
        else if(c1 > 2){
            c1 = c1 - 2;
            sum = 30 * 4;

            if(c1 < 2){
                c1 = c1*2;
                c2 = c2/30;
                sum =sum + (c1 + c2)*40;
                System.out.println(sum);
            }else if(c1 >= 2){
                c1 = c1 - 2;
                sum =sum + 40 * 4;
                c1 = c1*2;
                c2 = c2/30;
                sum = sum + (c1 + c2)*60;
                System.out.println(sum);
            }
        }
    }
}
