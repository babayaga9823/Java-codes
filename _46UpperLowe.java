package com.company;

import java.util.Scanner;

public class _46UpperLowe {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int l = str.length();
        int vowels = 0;
        int lowerCase = 0;
        int upperCase = 0;
        for (int i = 0; i < l; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i'
                    ||str.charAt(i) == 'o' || str.charAt(i) == 'u' ||str.charAt(i) == 'A'
                    || str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U'){
                vowels++;
            }
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                lowerCase++;
            }
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90 ){
                upperCase++;
            }
        }
        System.out.println("No of vowels : "+ vowels);
        System.out.println("No of upperCase : "+ upperCase);
        System.out.println("No of lowerCase: "+ lowerCase);
        
    }
}
