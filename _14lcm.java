package com.company;

import java.util.Scanner;

public class _14lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1 = input.nextInt();
        int num3 = input.nextInt();
        int lcm = (num1 > num3) ? num1 : num3;
        int gcd = 1;
        while (true){
            if (lcm % num1 ==0 && lcm % num3 ==0){
                gcd = lcm / ( num1 * num3);
                System.out.println("LCM: " + lcm);
                System.out.println("GCD: " + gcd);
                break;
            }
            lcm++;
        }

    }
}
