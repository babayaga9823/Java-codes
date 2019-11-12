package com.company;

import java.util.Scanner;

public class _55Valid {
    public static boolean isValid(String str, String str3){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            int index = 0;
            for (int j = index; j < str3.length(); j++){
                if (str3.charAt(j) == str.charAt(i) && j >= index){
                    index = j;
                    count++;
                    break;
                }
            }
            if (count == str.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string 1 : ");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        System.out.println("Enter the string 2 : ");
        String str2 = input.nextLine();
        System.out.println("Enter the string 3 : ");
        String str3 = input.nextLine();
        if (isValid(str1, str3) && isValid(str2 , str3)){
            System.out.println("Valid shuffling!! ");
        }
    }
}
