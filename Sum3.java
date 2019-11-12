import java.io.*;
class Sum3
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int n, s = 0, j, fact = 1;
        System.out.println("Enter the value of n");
        n = Integer.parseInt(in.readLine());
        for(int i = 1; i <= n; i++)
        {
            fact = 1;
            for(j = 1; j <= i; j++)
            {
                fact = fact * j;
            }
            s = s + fact;
        }
        System.out.println("the sum is "+ s);
    }
}