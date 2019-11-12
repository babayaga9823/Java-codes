import java.io.*;
class hadamard 
{ 
public static void main(String[] args) throws IOException
{
  InputStreamReader read = new InputStreamReader (System.in);
  BufferedReader in = new BufferedReader (read);
  int k = Integer.parseInt(in.readLine());
  boolean[][] Had = new boolean[k][k];

  // initialize Hadamard matrix of order N
  Had[0][0] = true;
  for (int n = 1; n < k; n += n) 
{
     for (int i = 0; i < n; i++) 
{
        for (int j = 0; j < n; j++) 
{
           Had[i+n][j]   =  Had[i][j];
           Had[i][j+n]   =  Had[i][j];
           Had[i+n][j+n] = !Had[i][j];
        }
     }
  }

  // print matrix
  for (int i = 0; i < k; i++) {
     for (int j = 0; j < k; j++) {
        if (Had[i][j]) System.out.print("T ");
        else         System.out.print("F ");
     }
     System.out.println();
    }
  }

}