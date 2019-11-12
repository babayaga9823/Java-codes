package com.company;

import java.util.Scanner;

public class _48Count {
    public static void main(String[] args) {
        System.out.println("Enter the input : ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String arr[] = str.split("\\ ");
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            int index = arr[i].length();
            if((arr[i].charAt(0) == 'a' || arr[i].charAt(0) == 'e' ||arr[i].charAt(0) == 'i'
                    ||arr[i].charAt(0) == 'o' || arr[i].charAt(0) == 'u' ||arr[i].charAt(0) == 'A'
                    || arr[i].charAt(0) == 'I' ||arr[i].charAt(0) == 'O' ||arr[i].charAt(0) == 'U') &&
                    (arr[i].charAt(index-1) == 'a' || arr[i].charAt(index-1) == 'e' ||arr[i].charAt(index-1) == 'i'
                    ||arr[i].charAt(index-1) == 'o' || arr[i].charAt(index-1) == 'u' ||arr[i].charAt(index-1) == 'A'
                    || arr[i].charAt(index-1) == 'I' ||arr[i].charAt(index-1) == 'O' ||arr[i].charAt(index-1) == 'U')){
                count++;
            }
        }
        System.out.println("No of words starts and ends with vowels are : " + count);
    }
}
