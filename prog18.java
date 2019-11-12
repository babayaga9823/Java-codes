import java.util.Scanner;
class prog18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x1, y1, x, y, r;
        System.out.println("enter the x, y and r of circle");
        x = sc.nextInt();
        y = sc.nextInt();
        r = sc.nextInt();
        System.out.println("Enter the points");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        if((x - x1) * (x - x1) + (y - y1) * (y - y1) <= r * r)
        {
            System.out.println("Point lie in circle");
        }
        else
        {
            System.out.println("Point doesnt lie in circle");
        }
    }
}