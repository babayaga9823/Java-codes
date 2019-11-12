package com.company;

import java.util.Scanner;

public class _30seive {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int arr[] = new int[x+1];
        // initialse the array with 0, 1, 2, 3, 4, 5, 6, 7
        for (int  i = 0; i <= x ; i++){
            arr[i] = i;
        }
        // seive of erathomus
        int i = 2;
        while (i <= Math.sqrt(x)){
            if (arr[i] < 0){
                i++;
            } else {
                for (int j = i+1; j <= x; j++){
                    if (arr[j] % i == 0){
                        arr[j] = -1;
                    }
                }
                i++;
            }
        }
        for (int j = 2; j <= x; j++){
            if (arr[j] != -1){
                System.out.print(arr[j] + " ");
            }
        }

    }
}
