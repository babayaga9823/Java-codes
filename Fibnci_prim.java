import java.util.*;

class Fibnci_prim
{ 


    static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
  
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 

    static int fib(int n) 
    { 
       
        int a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) { 
            c = a + b; 
            a = b; 
            b = c;

            if(isPrime(c) )
                System.out.print(c+" ");
        }
        System.out.print("\n");
        return b; 
    }


  
    public static void main(String args[]) 
    { 
        int n = 9; 
        System.out.println(fib(n)); 

    } 
} 
  