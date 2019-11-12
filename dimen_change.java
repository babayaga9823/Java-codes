import java.util.Scanner; 

class dimen_change {
public static void main(String args[])
  {
    int[] grid = {5, 3, 1, 2, 0, 4, 1, 1, 3 };
    int i=0,j=0;
    Scanner in = new Scanner(System.in); 
    int x,y;
    x=in.nextInt();
    y=in.nextInt() ;
    int count=-1;int k;
    int[][] arr=new int[x][y];

    for(i=0;i<x;i++)
    {
    	count++;
	      for(j=0;j<y;j++)
	      {
	              k=j+count*y;
	              arr[i][j]=grid[k];
	     }
    }


   for(i=0;i<x;i++)
   {
    for(j=0;j<y;j++)
    {

        System.out.print(arr[i][j]+" ");
    }
    System.out.println(" ");
    }

  }
}