package com.company;

import java.util.Scanner;

public class _64caepher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the expression ");
        String exp = input.nextLine();
        String ans = " ";
        int l = exp.length();
        for (int i = 0 ; i < l; i++){
            if (exp.charAt(i) >= 97 && exp.charAt(i) <= 122){
                ans += (char) (exp.charAt(i) + 13);
            }
            if(exp.charAt(i) >= 65 && exp.charAt(i) <= 90 ){
                ans += (char) (exp.charAt(i) + 13);
            }
        }
        System.out.println("The encrypted text is : " + ans);
    }
}
