package com.company;

import java.util.Scanner;

public class _67Common {
    public static void main(String[] args) {
        System.out.println("Enter the size of first array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println("Enter the first array: ");
        int arr1[] = new int[size];
        for (int i = 0; i < size; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the size of second array: ");
        int size2 = input.nextInt();
        int arr2[] = new int[size2];
        for (int j = 0; j < size2; j++){
            arr2[j] = input.nextInt();
        }
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size2; j++){
                if (arr1[i] == arr2[j]){
                    System.out.println(" " + arr1[i]);
                }
            }
        }
    }
}
