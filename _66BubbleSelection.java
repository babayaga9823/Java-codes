package com.company;

import javax.swing.text.MutableAttributeSet;
import java.util.Scanner;

public class _66BubbleSelection {
    public static void BubbleSort(int arr[], int l){
        for (int i = 0; i < l-1; i++){
            for (int j = 0; j < l-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Bubble sort: ");
        for (int j = 0; j < l; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
    public static void SelectionSort(int arr[], int l){
        for (int i = 0; i < l; i++){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = i; j < l; j++){
                if (arr[j] < min){
                    index = j;
                    min = arr[j];
                }
            }
            int temp = min;
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Selection sort: ");
        for (int j = 0; j < l; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("1. Bubble Sort ");
        System.out.println("2. Selection sort ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        System.out.println("Enter the size of the array ");
        int l = input.nextInt();
        System.out.println("Enter the array ");
        int arr1[] = new int[l];
        for (int i = 0; i < l; i++){
            arr1[i] = input.nextInt();
        }
        switch (choice){
            case 1: {
                BubbleSort(arr1, l);
                break;
            }
            case 2: {
                SelectionSort(arr1, l);
                break;
            }
            default:{
                System.out.println("No option selected ");
            }
        }
    }
}
