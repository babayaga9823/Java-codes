package com.company;

import java.util.Scanner;

public class _41Duplicate {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int l1 = str.length();
        char c = ' ';
        for (int i = 0; i < l1; i++){
            for (int j = i+1; j < l1; j++){
                if (str.charAt(j) == str.charAt(i)){
                    str = str.replace(str.charAt(i) , ' ');
                }
            }
        }
        System.out.println("After replacing " + str);
//        int arr[] = new int[26];
//        for(int i = 0; i < l1; i++){
//            if (str.charAt(i) != ' '){
//                int index = str.charAt(i) - 'a';
//                System.out.print(index + " ");
//                if(arr[(index)] == 0){
//                    arr[index] = 1;
//                } else {
//                    arr[index] += 1;
//                }
//            }
//        }
//        System.out.println();
//        for(int j = 0; j < 26; j++){
//            if(arr[j] > 0){
//                System.out.print(arr[j] + " ");
//            }
//        }
        System.out.println();
    }
}
