import java.io.*;
import java.util.Scanner;
class Swap
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before Swapping :");
        System.out.println("a = " + a + " b = " + b);
        func1(a, b);
        func2(a, b);
    }
    public static void func1(int a, int b)
    {
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping using third variable :");
        System.out.println("a = " + a + " b = " + b);
    }
    public static void func2(int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping without using third variable :");
        System.out.println("a = " + a + " b = " + b);
    }
}