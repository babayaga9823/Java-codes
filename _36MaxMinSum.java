package com.company;

import java.util.Scanner;

public class _36MaxMinSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row and column value ");
        int row = input.nextInt();
        int col = input.nextInt();
        System.out.println("Enter the matrix ");
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Min value "+ min);
        System.out.println("Max value "+ max);
        int sum = min + max;
        System.out.println("The sum of min and max value is "+ sum);
    }
}
