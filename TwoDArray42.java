/* 42 */

import java.util.Scanner;
import java.lang.Math;
class TwoDArray42
{
    public static void main(String args[])
    {
        
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int b[][]=new int[n][m];
       int a[]=new int[100000];
       int i,j,k=0,c=0,p=0;
       for(i=2;i<=100000;i++)
       {
       	  for(j=2;j<i;j++)
       	  {
       	  	 if(i%j==0)
       	  	 {
       	  	 	 c++;
       	  	 	 if(c>0)
       	  	 	 {
       	  	 	 	break;
       	  	 	 }
       	  	 }
       	  }
       	  if(c==0)
       	  {
       	  	 a[k++]=i;
       	  	 if(k==n*m)
       	  	 {
       	  	 	break;
       	  	 }
       	  }
       	  c=0;
       }
    for(i=0;i<n;i++)
    {
    	for(j=0;j<m;j++)
    	{
    		b[i][j]=a[p+i];
    		p++;
    	}
    	p--;
     }
    for(i=0;i<n;i++)
    {
    	for(j=0;j<m;j++)
    	{
    		System.out.print(b[i][j]+" ");
        }
            System.out.println();
    }  
   }
}