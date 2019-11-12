import java.util.*;
class prog76
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int num, k = 0, d, t;
        System.out.println("Enter a number ");
        num = sc.nextInt();
        t = num;
        while(t > 0)
        {
            d = t % 10;
            t = t / 10;
            if(d == 0 || d == 1)
            {
                continue;
            }
            else
            {
                k = 1;
                break;
            }
            
        }
        if(k == 1)
        {
            System.out.println(num + " is not binary");
        }
        else
        {
            System.out.println(num + " is binary");
        }
    }
}