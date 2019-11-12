import java.io.*;
import java.util.Scanner;
class Largest
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner (System.in);
        int a, b, c, ch;
        System.out.println("Enter the three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a > b && a > c)
        {
            System.out.println("Largest is " + a);
        }
        if(b > a && b > c)
        {
            System.out.println("Largest is " + b);
        }
        if(c > a && c > b)
        {
            System.out.println("Largest is " + c);
        }
        if(a < b && a < c)
        {
            System.out.println("Smallest is " + a);
        }
        if(b < a && b < c)
        {
            System.out.println("Smallest is " + b);
        }
        if(c < b && c < a)
        {
            System.out.println("Smallest is " + c);
        }
    }
}
