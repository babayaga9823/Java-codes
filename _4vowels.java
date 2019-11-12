package com.company;

import java.util.Scanner;

public class _4vowels {
    public static void main(String[] args) {
        char a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input: ");
        a = input.next(".").charAt(0);
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
            System.out.println("Vowel "+ a);
        } else {
            System.out.println("Consonant "+a);
        }
    }
}
