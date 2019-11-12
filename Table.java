import java.io.*;
class Table
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int num, i, fact = 1;
        System.out.println("Enter a number");
        num = Integer.parseInt(in.readLine());
        for(i = 1; i <= num ; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
        for(i = 1; i <= 10; i++)
        {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
