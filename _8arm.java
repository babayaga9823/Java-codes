package com.company;

import java.util.Scanner;

public class _8arm {
    static public void armstrong(int x){
        int rem = 0, sum = 0;
        while(x != 0){
            rem = x % 10;
            sum = sum + (rem*rem*rem);
            x = x/10;
        }
        if(sum == x){
            System.out.println("Yes!, Armstrong");
        } else {
            System.out.println("Nopes! Armstrong");
        }
    }
    static public void primeCheck(int x){
        int flag = 0;
        for (int i = 2; i <= x/2; i++){
            if(x % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Nopes!, prime");
        } else  {
            System.out.println("yes!, prime");
        }
    }
    static public void perfectCheck(int x){
        int sum = 0;
        for (int i = 1; i < x; i++){
            if(x % i == 0){
                sum = sum + i;
            }
        }
        if(sum == x){
            System.out.println("Yes !, Perfect number");
        } else {
            System.out.println("Nopes! Perfect Number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input : ");
        int n = input.nextInt();
        System.out.println("Enter your choice: ");
        System.out.println("1. Armstrong");
        System.out.println("2. Prime");
        System.out.println("3. Perfect ");
        int choice = input.nextInt();

        switch (choice){
            case 1: {
                armstrong(n);
                break;
            }
            case 2: {
                primeCheck(n);
                break;
            }
            case 3: {
                perfectCheck(n);
                break;
            }
            default:{
                System.out.println("None");
            }
        }

    }
}
