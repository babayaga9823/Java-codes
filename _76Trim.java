package com.company;

import java.util.Scanner;

public class _76Trim {
    public static void main(String[] args) {
        System.out.println("Enter a string ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Before replacing multiple spaces "+ str);
        str = str.replaceAll("\\s+"," ");
        str = str.trim();
        System.out.println("After replacing multiple spaces  " + str);
    }
}
