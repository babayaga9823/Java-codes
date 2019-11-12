package com.company;

import java.util.Scanner;

public class _9NoOfEven {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int even = 0, odd = 0;
        while (num != 0){
            int rem = num % 10;
            if(rem % 2 == 0){
                even++;
            } else {
                odd++;
            }
            num = num/10;
        }
        System.out.println("No of even digits " + even);
        System.out.println("No of odd digits " + odd);
    }
}
