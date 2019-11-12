import java.util.*;
class prog16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("enter the row number");
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int c = 0; c <= (n - i - 2); c++)
                System.out.print(" ");
 
            for (int c = 0 ; c <= i; c++)
                System.out.print(factorial(i)/(factorial(c)*factorial(i-c))+ " ");
            System.out.println();
        }
    }
    public static long factorial(int n)
    {
        int c;
        long result = 1;
        for (c = 1; c <= n; c++)
            result = result*c;
        return result;
    }
}