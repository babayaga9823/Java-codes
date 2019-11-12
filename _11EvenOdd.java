package com.company;

import java.util.Scanner;

public class _11EvenOdd {
    public static void evenDiv(int x){
        for (int i = 1; i < x; i++) {
            if (x % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
    public static void oddDiv(int x){
        for (int j = 1; j < x; j++){
            if (x % 2 != 0){
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Even divisor ");
        System.out.println("2. Odd divisor ");

        System.out.println("Enter your choice: ");
        int choice = input.nextInt();

        System.out.println("Enter the number ");
        int num = input.nextInt();

        switch (choice){
            case 1: {
                evenDiv(num);
                break;
            }
            case 2:{
                oddDiv(num);
                break;
            }
            default:{
                System.out.println("None called ");
            }
        }
    }
}
