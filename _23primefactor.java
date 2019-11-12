package com.company;

import java.util.Scanner;

public class _23primefactor {
    public static boolean isPrime(int x){
        for (int i = 2; i <= x/2; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int pro = 1;
        for (int  i = 2; i <= x; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
