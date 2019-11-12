package com.company;

import java.util.Scanner;

public class _22primeorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int primorial = 1, k =0, ind = 0;
        for (int i = 2; i <= number; i++){
            int count = 0;
            for (int j = 1; j<=i; j++){
                if (i % j == 0){
                    count++;
                }
                if (count == 2){
                    primorial = primorial * i;
                }
            }
        }
        System.out.println(primorial);
    }
}
