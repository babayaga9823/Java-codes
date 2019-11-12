package com.company;

import java.util.Scanner;

public class _6bSumSeries {
    public static int calculateSum(int n)
    {
        // when n is odd
        if (n % 2 == 1)
            return (n + 1) / 2;

        // when n is not odd
        return -n / 2;
    }

    public static void main(String[] args) {
        System.out.println("1-2+3-4+5-6+......... n");
        System.out.println("Enter the value of n ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans  = calculateSum(n);
        System.out.println("Sum of the series is : "+ans);
    }

}
