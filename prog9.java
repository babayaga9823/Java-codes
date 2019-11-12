import java.io.*;
import java.util.Scanner;
class prog9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        Integer n=sc.nextInt();
        int d,even=0,odd=0;
        while(n>0)
        {
            d=n%10;
            if(d%2==0)
            even++;
            else
            odd++;
            n=n/10;
        }
        System.out.println("Even digits: "+even);
        System.out.println("Odd digits: "+odd);

    }
}