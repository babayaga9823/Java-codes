import java.util.*;
class prog10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n, ch;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        System.out.println("1. Enter 1 to print fibonacci upto " + n + " terms");
        System.out.println("2. Enter 2 to print tribonacci upto " + n + " terms");
        System.out.println("Enter your choice");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                int f = 0, s = 1, th, i;
                System.out.println("The fibonacci series is :");
                System.out.print(f + ", " + s + ", ");
                for(i = 2; i <= n; i++)
                {
                    th = f + s;
                    f = s;
                    s = th;
                    System.out.print(th + ", ");
                }
                System.out.println();
                break;
            case 2:
                f = 0; s = 1; th = 1;
                int fo;
                System.out.println("The triibonacci series is :");
                System.out.print(f + ", " + s + ", " + th + ", ");
                for(i = 3; i <= n; i++)
                {
                    fo = f + s + th;
                    f = s;
                    s = th;
                    th = fo;
                    System.out.print(fo + ", ");
                }
                System.out.println();
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}