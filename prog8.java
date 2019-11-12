import java.io.*;
import java.util.Scanner;
class prog8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        Integer n=sc.nextInt();
        System.out.println("Enter 1 to check Prime, 2 to check Armstrong, 3 to check Magic,4 to check Palindrome, 5 to check Perfect");
        System.out.println("Enter your choice");
        Integer ch=sc.nextInt();
        int sum=0,s,d,r;
        switch(ch)
        {
            case 1:
                sum=0;
                for(int i=1;i<=n;i++)
                {
                    if(n%i==0)
                        sum++;
                }
                if(sum==2)
                    System.out.println("Number is prime");
                else
                    System.out.println("Number is not prime");
                break;
            case 2:
                s=n;
                sum=0;
                while(s>0)
                {
                    d=s%10;
                    sum+=d*d*d;
                    s=s/10;
                }
                if(sum==n)
                    System.out.println("Number is Armstrong");
                else
                    System.out.println("Number is not Armstrong");
                break;
            case 3:
                s=n;
                sum=0;
                while(s>0)
                {
                    d=s%10;
                    sum+=d;
                    s=s/10;
                }
                r=0;
                int cpy=sum;
                while(sum>0)
                {
                    d=sum%10;
                    r=r*10+d;
                    sum=sum/10;
                }
                int prod=cpy*r;
                if(prod==n)
                    System.out.println("Number is Magic");
                else
                    System.out.println("Number is not Magic");
                break;
            case 4:
                s=n;
                r=0;
                while(s>0)
                {
                    d=s%10;
                    r=r*10+d;
                    s=s/10;
                }
                if(r==n)
                    System.out.println("Number is Palindrome");
                else
                    System.out.println("Number is not Palindrome");
                break;
            case 5:
                sum=0;
                for(int i=1;i<n;i++)
                {
                    if(n%i==0)
                    sum+=i;
                }
                if(sum==n)
                    System.out.println("Number is Perfect");
                else
                    System.out.println("Number is not Perfect");
                break;
        }
    }
}