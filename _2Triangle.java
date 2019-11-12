package com.company;

import java.util.Scanner;

public class _2Triangle {
    public static boolean isValid(double a, double b, double c){
        if(a + b > c || a + c > b || b + c > a){
           return true;
        } else {
            return false;
        }
    }
    public static void isScalene(double a, double b, double c){
        if(a != b && b != c && c != a){
            System.out.println("Scalene triangle");
        }
    }
    public static void isEquilateral(double a, double b, double c){
        if(a == b && b == c){
            System.out.println("Equilateral triangle");
        } else {
            System.out.println("Not an equilateral triangle");
        }
    }
    public static void isIsosceles(double a, double b, double c){
        if((a == b && b != c) |(b == c && a != c)){
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Not an isosceles triangle ");
        }
    }
    public static void isRight(double a, double b, double c){
        if (a*a + b*b == c*c | a*a + c*c == b*b | b*b + c*c == a*a){
            System.out.println("Right angled triangle");
        } else {
            System.out.println("Not a right angled triangle");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.println("1. Equilateral ");
        System.out.println("2. Isosceles ");
        System.out.println("3. Scelene ");
        System.out.println("4. Right angled ");
        System.out.println("5. Validity ");

        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice){
            case 1: {
                if (isValid(a,b,c)){
                    isEquilateral(a, b, c);
                    break;
                }
            }
            case 2: {
                if (isValid(a, b,c)){
                    isIsosceles(a, b,c);
                    break;
                }
            }
            case 3: {
                if (isValid(a,b,c)){
                    isScalene(a, b, c);
                    break;
                }
            }
            case 4:{
                if (isValid(a,b,c)){
                    isRight(a,b,c);
                    break;
                }
            }
            case 5:{
                if (isValid(a,b,c)){
                    System.out.println("Valid");
                    break;
                }
            }
            default:{
                System.out.println("None");
            }
        }


    }
}
