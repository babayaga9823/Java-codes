import java.util.*;
class prog20
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int num, i, d, t, s = 0, sum = 0;
        System.out.println("Enter a number");
        num = sc.nextInt();
        t = num;
        while(t > 0)
        {
            d = t % 10;
            sum += d;
            t = t /10;
        }
        for(i = 2; i <= num; )
        {
            if(num % i == 0)
            {
                t = i;
                while(t > 0)
                {
                    d = t % 10;
                    s += d;
                    t = t /10;
                }
                num = num / i;
            }
            else
            {
                i++;
            }
        }
        if(sum == s)
        {
            System.out.println("It is a smith number");
        }
        else
        {
            System.out.println("It is not a smith number");
        }
    }
}