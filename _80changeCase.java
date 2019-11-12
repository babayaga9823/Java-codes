package com.company;

import java.util.Scanner;

public class _80changeCase {
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String ans = " ";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122){
               ans = ans + (char)(str.charAt(i) - 32);
            }
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                ans = ans + (char)(str.charAt(i) + 32);
            }
        }
        System.out.println(ans);
    }
}
