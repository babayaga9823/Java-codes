/* (41) remove duplicates from word*/

import java.util.Scanner;
class RemoDuplicates41  
{ 
    public static void main(String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int i,j,n=s.length,k=0; 
        char[] P = new char[100];
        for(i=0;i<n;i++)
        {
 
        	for(j=0;j<i;j++)
        	{
        		if(s[i]==s[j])
        		{
        		   break;
        		}
        	}
        	if(i==j)
        	{
        		P[k++]=s[i];
        	}
        	}
        
          
          		System.out.print(P);
          	
        	
        
    }
}
    
