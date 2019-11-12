package com.company;

import java.util.Scanner;

public class _54Freq {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int arr[] = new int[26];
        int l = str.length();
        for (int i = 0 ; i < l; i++){
            if (str.charAt(i) != ' '){
                int index = str.charAt(i) - 'a';
                if (arr[index] == 0){
                    arr[index] = 1;
                } else if (arr[index] >= 1){
                    arr[index]++;
                }
            }
        }
        int m = Integer.MIN_VALUE;
        int ans = 0;
        for (int j = 0; j < 26; j++){
            if (arr[j] != 0 && arr[j] > m){
                m = arr[j];
                ans = j;
            }
        }
        System.out.println("Most frequent character is " + (char)(ans + 'a'));
    }
}
