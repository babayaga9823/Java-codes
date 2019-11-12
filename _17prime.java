package com.company;

import java.util.Scanner;

public class _17prime {
    public static boolean isPrime(int x){
        for (int i = 2; i <= x/2; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int n){
        for (int i = 2; i <= n ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPrime(n);
    }
}
