import java.io.*;
class Sum1
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int n, s = 0;
        System.out.println("Enter the value of n");
        n = Integer.parseInt(in.readLine());
        for(int i = 12; i <= n; i = i + 10)
        {
            s = s + i;
        }
        System.out.println("the sum is "+ s);
    }
}