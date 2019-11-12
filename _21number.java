package com.company;

import java.util.Scanner;

public class _21number {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String words[] = new String[10];
        words[0] = "zero";
        words[1] = "one";
        words[2] = "two";
        words[3] = "three";
        words[4] = "four";
        words[5] = "five";
        words[6] = "six";
        words[7] = "seven";
        words[8] = "eight";
        words[9] = "nine";
        int ans[] = new int[100];
        int k = 0;
        while (x > 0){
            int rem = x % 10;
            ans[k++] = rem;
            x = x / 10;
        }
        int size = ans.length;
        for (int i = k-1; i >=0; i--){
            System.out.print(words[ans[i]] + " ");
        }
    }
}
