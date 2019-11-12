import java.io.*;
class Range
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int num, i, fact = 1, j;
        for(j = 1; j <= 1000; j++)
        {
            fact = 1;
            if(j <= 15)
            {
                for(i = 1; i <= j ; i++)
                {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + j + " is " + fact);
            }
            for(i = 1; i <= 10; i++)
            {
                System.out.println(j + " * " + i + " = " + (j * i));
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
