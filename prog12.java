import java.util.*;
class prog12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a, b, c;
        double x1 = 0.0d, x2 = 0.0d;
        System.out.println("Enter the values of a, b and c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x1 = (double)(-b + ((double)Math.sqrt((b * b) - 4 * a * c))) / (double)(2.0 * a);
        x2 = (double)(-b - ((double)Math.sqrt((b * b) - 4 * a * c))) / (double)(2.0 * a);
        System.out.println("the roots are : " + x1 + " and " + x2);
    }
}