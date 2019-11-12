package com.company;

import java.util.Scanner;

public class _75isBinary {
    public static void main(String[] args) {
        System.out.println("Enter a binary number ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int orgNum = number;
        int flag = 0;
        while (number > 0){
            int rem = number % 10;
            if(rem > 1){
                flag = 1;
                break;
            }
            number = number / 10;
        }
        if (flag == 1){
            System.out.println("Not a binary number " + orgNum);
        } else {
            System.out.println("Binary number "+ orgNum);
        }
    }
}
