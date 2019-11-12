import java.util.*;
class prog65
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        if(circular(num))
        {
            System.out.println("Circular Prime");
        }
        else
        {
            System.out.println("Not Circular Prime");
        }
    }
    public static boolean circular(int num)
    {
        int n = num, d, t = num;
        while (isprime(n))
         {
            d = t % 10;
            t = t / 10;
            String str = d + "" + t;
            n = Integer.parseInt(str);
            t = n;
            if (n == num)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean isprime(int num)
    {
        int i, c = 0;
        for(i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                c = c + 1;
            }
        }
        if(c == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}