package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class _69Repeated {
    public static String mostRepeated(ArrayList<String>arr){
        int count = 0, max = Integer.MIN_VALUE;
        String str = "";
        for (int i = 0; i < arr.size(); i++){
            for (int j = i+1; j < arr.size(); j++){
                if (arr.get(i).equals(arr.get(j))){
                    count++;
                }
            }
            if(count > max){
                max = count;
                str = arr.get(i);
            }
        }
        return str;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Reading file...");
        FileReader file = new FileReader("data.txt");
        String line;
        ArrayList<String> words = new ArrayList<String>();
//        String words[] = new String[]
        BufferedReader br = new BufferedReader(file);
        while ((line = br.readLine()) != null){
            String string[] = line.toLowerCase().split("([,.\\s]+) ");
            for (int i = 0; i < string.length; i++){
                words.add(string[i]);
            }
        }
        String ans = mostRepeated(words);
        System.out.println("Most repeated word in the file is : " + ans);
    }
}
