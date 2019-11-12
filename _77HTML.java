package com.company;

import java.util.Scanner;

public class _77HTML {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Before removing HTML tags " + str);
        str = str.replaceAll("\\<.*?\\>", " ");
        System.out.println("After removing HTML tags "+ str);
    }
}
