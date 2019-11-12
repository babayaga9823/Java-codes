import java.util.*;
class prog11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num, i;
        int k = 0, k1 = 0;
        System.out.println("Enter a number ");
        num = sc.nextInt();
        int even[] = new int [num];
        int odd[] =  new int [num];
        for(i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                if(i % 2 == 0)
                {
                    even[k] = i;
                    k++;
                }
                else
                {
                    odd[k1] = i;
                    k1++;
                }
            }
        }
        System.out.println("The even divisors of " + num + " are :");
        for(i = 0; i < even.length; i++)
        {
            if(even[i] != 0)
                System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.println("The odd divisors of " + num + " are :");
        for(i = 0; i < odd.length; i++)
        {
            if(odd[i] != 0)
                System.out.print(odd[i] + " ");
        }
        System.out.println();
    }
}