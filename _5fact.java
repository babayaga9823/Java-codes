package com.company;

import java.util.Scanner;

public class _5fact {
    static public int printfact(int x){
        if(x == 0){
            return 1;
        } else {
            return x * printfact(x-1);
        }
    }
    static public void printTable(int x){
        for(int i = 1; i <= 10; i++){
            System.out.print(x * i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int a = input.nextInt();
        int ans = printfact(a);
        System.out.println("Factorial of input is "+ ans);
        System.out.println("Table of the input is ");
        printTable(a);
    }
}
