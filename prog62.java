import java.util.*;
class prog62
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int num, p = 0 , k = 0, d, t;
        System.out.println("Enter a number in decimal form");
        num = sc.nextInt();
        t = num;
        while(t > 0)
        {
            d = t % 2;
            p = p + d * (int)Math.pow(10, k);
            k = k + 1;
            t = t / 2;
        }
        System.out.println("The number in binary form is " + p);
    }
}