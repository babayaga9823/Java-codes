import java.util.*;
class prog13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3;
        double a, b, c;
        System.out.println("Enter the first point");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter the second point");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("Enter the third point");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        c = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        if((a + b == c) || (a + c == b) || (b + c == a))
        {
            System.out.println("The points lie on the same line");
        }
        else
        {
            System.out.println("The points don't lie in the same line");
        }
    }
}