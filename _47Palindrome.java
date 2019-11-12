package com.company;

import java.util.Scanner;

public class _47Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the sentence: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String arr[] = new String[100];
        arr = str.split("\\ ");
        System.out.println("Words are : ");
        for (int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        int n = arr.length;
        for (int j = 0; j < n; j++){
            StringBuilder input1 = new StringBuilder();
            StringBuilder input2 = new StringBuilder();
            input2.append(arr[j]);
            input1.append(arr[j]);
            input1 = input1.reverse();
            System.out.println("input1 "+ input1);
            System.out.println("input2 " + input2);
            if (input1 == input2){
                System.out.println("Palindrome : " + arr[j]);
            }
        }
    }
}
