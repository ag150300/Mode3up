package com.company;

import java.util.Scanner;

public class Ex20171113_5 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int t = 0;
        boolean flag = false;
        if(n < m){
            t = n;
            n = m;
            m = t;
        }

        while (m != 0 && n != 1){
        n = n%m;
        if(n == 0){
            flag = true;
            break;
        }else {
            m = m % n;
        }
        }
        if(flag == false) {
            System.out.println(n);
        }else if(flag == true){
            System.out.println(m);
        }
    }
}

