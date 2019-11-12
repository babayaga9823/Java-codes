import java.io.*;
class Sum2
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int n, s = 0, j;
        System.out.println("Enter the value of n");
        n = Integer.parseInt(in.readLine());
        for(int i = 1; i <= n; i++)
        {
            j = i;
            if(i % 2 == 0)
            {
                j = i * (-1);
            }
            s = s + j;
        }
        System.out.println("the sum is "+ s);
    }
}