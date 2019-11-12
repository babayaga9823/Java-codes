import java.io.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class Triangle
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner (System.in);
        int a, b, c, ch;
        System.out.println("Enter the three sides of the triangle");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("MENU :");
        System.out.println("1. Press 1 to check whether triangle is possible or not");
        System.out.println("2. Press 2 to check whether triangle is eqilateral or not");
        System.out.println("3. Press 3 to check whether triangle is isosceles or not");
        System.out.println("4. Press 4 to check whether triangle is scalene or not");
        System.out.println("Enter your choice");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                if(((a + b) > c) && ((a + c) > b) && ((c + b) > a))
                    System.out.println("Triangle Possible");
                else
                    System.out.println("Triangle not Possible");
                break;
            case 2:
                if(((a + b) > c) && ((a + c) > b) && ((c + b) > a))
                {
                    if(a == b && b == c)
                        System.out.println("Equilateral Triangle");
                    else
                        System.out.println("Not an Equilateral Triangle");
                }
                else
                    System.out.println("Triangle not Possible");
                break;
            case 3:
                if(((a + b) > c) && ((a + c) > b) && ((c + b) > a))
                {
                    if(a == b || b == c || c == a)
                        System.out.println("Isosceles Triangle");
                    else
                        System.out.println("Not an Isosceles Triangle");
                }
                else
                    System.out.println("Triangle not Possible");
                break;
            case 4:
                if(((a + b) > c) && ((a + c) > b) && ((c + b) > a))
                {
                    if(a != b && b != c && c != a)
                        System.out.println("Scalene Triangle");
                    else
                        System.out.println("Not a Scalene Triangle");
                }
                else
                    System.out.println("Triangle not Possible");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
