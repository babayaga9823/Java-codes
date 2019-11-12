import java.util.*;
class prog14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a, b, ch;
        System.out.println("Enter two numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("1. Enter 1 to find gcd of two numbers");
        System.out.println("2. Enter 2 to find lcm of two number");
        System.out.println("Enter your choice");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                int g = gcd(a, b);
                System.out.println("The GCD of " + a + " and " + b + " is : " + g);
                break;
            case 2: 
                int l = lcm(a, b);
                System.out.println("The LCM of " + a + " and " + b + " is : " + l);
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
    public static int gcd(int a, int b)
    {
        int max = (a > b) ? a : b;
        int g = 0;
        for(int i = 1; i <= max; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                g = i;
            }
        }
        return g;
    }
    public static int lcm(int a, int b)
    {
        int l = (a * b) / gcd(a, b);
        return l;
    }
}