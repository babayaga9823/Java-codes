import java.io.*;
class Sum4
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int n, i, j, k = 1;
        double s = 0.0d;
        for(i = 2, j = 9; i <= 8; i += 3, j += 4)
        {
            if(k % 2 == 0)
            {
                s = (double)(s + (double)((-1) * (double)((double)(i)/j)));
            }
            s = (double)(s + (double)((double)(i)/j));
            k++;
        }
        System.out.println("the sum is "+ s);
    }
}