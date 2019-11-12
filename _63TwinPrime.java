package com.company;

public class _63TwinPrime {
    public static boolean isPrime(int x){
        for (int i = 2; i <= x/2; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = new int[50];
        int k = 0;
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                arr[k++] = i;
            }
        }
        for (int i = 0; i < k; i++){
            if (arr[i+1] - arr[i] == 2){
                System.out.print("( " + arr[i] + "," + arr[i+1] + " )");
            }
        }
        System.out.println();
    }
}
