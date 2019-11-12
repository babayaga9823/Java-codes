import java.util.*;

class primorial
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number whose primorial is to be printed.");
        int num=ob.nextInt();
        long fact=1;
        for(int i=num;i>1;i--)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                fact=fact*i;
            }
        }
        System.out.println("Primorial of "+num+" is "+fact);
    }
}