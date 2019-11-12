package com.company;

import java.util.Scanner;

public class _7Fact {
    public static int fact(int x){
        if(x == 0){
            return 1;
        } else {
            return x * fact(x-1);
        }
    }
    public static void printTable(int x ) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(x * i + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = fact(num);
        System.out.println("Factorial of the number is "+fact);
        System.out.println("Table of the number is : ");
        printTable(num);
    }
}
