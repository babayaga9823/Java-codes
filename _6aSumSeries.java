package com.company;

import java.util.Scanner;

public class _6aSumSeries {
    public static void main(String[] args) {
        System.out.println("12 + 22 + 32 + 42 + 52 + 62 + 72 + 82 + 92 ");
        System.out.println("Enter the value of n i.e no of terms");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 10 * (n*(n+1)/2) + 2 * n;
        System.out.println("Sum is: "+ans);
    }
}
