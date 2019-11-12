package com.company;

import java.util.Scanner;

public class _10fibo {
    static public int tribonnaci(int n){
        if (n == 0 || n == 1 || n == 2)
            return 0;

        if (n == 3)
            return 1;
        else
            return tribonnaci(n - 1) +
                    tribonnaci(n - 2) +
                    tribonnaci(n - 3);
    }
    static public void printTribo(int n){
        for (int i = 1; i < n; i++)
            System.out.println(tribonnaci(n) + " ");
    }
    static public void fibonnaci(int n){
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; i++){
            System.out.println(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int n = input.nextInt();
        System.out.println("Enter your choice: ");
        System.out.println("1. Fibbonacci: ");
        System.out.println("2. Tribonaaci: ");
        int choice = input.nextInt();
        switch (choice){
            case 1:{
                fibonnaci(n);
                break;
            }
            case 2:{
                printTribo(n);
                break;
            }
            default:{
                System.out.println("How are you!");
            }
        }
    }
}
