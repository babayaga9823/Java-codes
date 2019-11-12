package com.company;

import java.util.Scanner;

public class _26prime {
    public static void main(String[] args) {
        int i =0, j = 0, n = 3, sum =0;
        int arr[][] = new int[3][3];
        Scanner input = new Scanner(System.in);
        for (i = 0; i < 3; i++){
            for (j = 0;j < 3; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                int count = 0;
                for (int k = 1; k <= arr[i][j]; k++){
                    if (arr[i][j] % k == 0 && arr[i][j] !=1){
                        count++;
                    }
                }
                if (count == 2){
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
