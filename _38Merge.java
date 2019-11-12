package com.company;

import java.util.Scanner;

public class _38Merge {
    public static void main(String[] args) {
        System.out.println("Enter the size of the first array ");
        Scanner input = new Scanner(System.in);
        int l1 = input.nextInt();
        System.out.println("Enter the size of second array ");
        int l2 = input.nextInt();
        System.out.println("Enter the first array ");
        int arr1[] = new int[l1];
        int arr2[] = new int[l2];
        System.out.println("Enter the first array ");
        for (int i = 0; i < l1; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the second array ");
        for (int j = 0; j < l2; j++){
            arr2[j] = input.nextInt();
        }
        int k = 0;
        int ans[] = new int[l1+l2];
        for (int i = 0; i < l1; i++){
            ans[k++] = arr1[i];
        }
        for (int j = 0; j < l2; j++){
            ans[k] = arr2[j];
            k++;
        }
        System.out.println("Merged array is ");
        for (int i = 0; i < l1+l2; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
