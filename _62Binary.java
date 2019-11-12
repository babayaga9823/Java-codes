package com.company;

import java.util.Scanner;

public class _62Binary {
    public static void main(String[] args) {
        System.out.println("Enter the number in decimal : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans[] = new int[100];
        int k = 0;
        while (num != 0){
            int rem = num % 2;
            ans[k++] = rem;
            num = num/2;
        }
        System.out.println("Binary number is : ");
        for (int j = k-1; j >= 0; j--){
            System.out.print(ans[j]);
        }
    }
}
