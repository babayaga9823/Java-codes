package com.company;

public class _15maxN {
    public static long factorial(long x){
        if (x == 0){
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }
    public static void main(String[] arg){
        long fact = 1, i = 1;
        while(fact >0){
            fact = factorial(i);
            if (fact < 0){
                System.out.println("max n : "+ i);
                break;
            }
            i++;
        }
    }
}
