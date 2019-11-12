package com.company;

import java.util.Scanner;

public class _79linearBinary {
    public static int binarySearch(int arr[], int l, int h, int key ) {
        int mid = (l + h) / 2;
        if (l <= h) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return binarySearch(arr, l, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, h, key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int l = input.nextInt();
        int arr[] = new int[l];

        System.out.println("Enter the array : ");
        for (int i = 0; i < l; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the number to search: ");
        int key = input.nextInt();

        // linear search
        for(int i = 0; i < l ; i++){
            if(arr[i] == key){
                System.out.println("Result of linear search " + i +1);
                break;
            }
        }

        // binary search
        int index = binarySearch(arr, 0, l, key);
        System.out.println("Result of binary search " + index + 1);
    }
}
