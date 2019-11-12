package com.company;

import java.util.Scanner;

public class _19leaps {
    public static Object dates = new Object();
    public static void main(String[] args) {
        System.out.println("Enter the date and month like for date 27, month 7 : ");
        Scanner input = new Scanner(System.in);
        System.out.println("Date: ");
        int date = input.nextInt();
        System.out.println("Month: ");
        int month = input.nextInt();
        if (date >= 29 && month == 2){
            System.out.println("Invalid date ");
        }
        if(date >= 31){
            System.out.println("Invalid date");
        }

    }
}
