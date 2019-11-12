package com.company;

import java.util.Scanner;

public class _60Boundary {
    public static void main(String[] args) {
        System.out.println("Enter the size of matrix: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("Enter the matrix ");
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                arr[i][j] = input.nextInt();
            }
        }
        for (int j = 0; j < size; j++){
            for (int k = 0; k < size; k++){
                if (j == 0 || j == size-1 || k == 0 || k == size-1){
                    System.out.print(arr[j][k] + " ");
                }
                else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
