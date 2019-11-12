import java.util.Scanner;

class _44m
    {
    public static void main(String args[]){
        
       System.out.print("Enter 2D array size : ");
       Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
       int i,j,p;
       System.out.println("Enter array elements : ");    
        
       int a[][]=new int[m][m];
        
          
        for(i=0; i<m;i++)
         {            
            for(j=0; j<m;j++)
            {
                a[i][j]=sc.nextInt();
           }
         }
         if(m>2 && m<10)
         {
         System.out.println("Original Mat : ");  
         for(i=0; i<m;i++)
         {            
            for(j=0; j<m;j++)
            {
                System.out.print(a[i][j] + "\t");
        	}
    	      System.out.println();
        }
        System.out.println("Rotated Mat : ");  
        for(i=0; i<m;i++)
         {            
            for(j=m-1; j>=0;j--)
            {
                System.out.print(a[j][i] + "\t");
           }
           System.out.println();
         }
         p=a[0][m-1]+a[0][0]+a[m-1][0]+a[m-1][m-1];
         System.out.println("Sum : ");  
         System.out.println(p);
         }
         else
         {
         	System.out.println("Invalid Input");  
         }
    }
 }
