// JAVA Code for Find difference between sums 
// of two diagonals 
class diangonal { 
	
	public static void print_dia(int arr[][], int n) 
	{  		int d1 = 0, d2 = 0; 
		int[] p= new int[n];
		int[] s= new int[n];
	
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < n; j++) 
			{ 
			 
				if (i == j) 
					p[i]= arr[i][j]; 
	
 				if (i == n - j - 1) 
					s[i] = arr[i][j]; 
			} 
		} 

		System.out.print("Primary Diagonal: ");
		  for (int i = 0; i < n; i++)  
		  	System.out.print(p[i]+ " "); 

		 System.out.println("\n");

		System.out.print("Secondary Diagonal: ");
		 for (int i = 0; i < n; i++)   
		 	System.out.print(s[i]+" ");

		 System.out.println("\n"); 
		 
	} 
	
 	public static void main(String[] args) 
	{ 
		int n = 3; 
		
		int arr[][] = 
		{ 
			{11, 2, 4}, 
			{4 , 5, 6}, 
			{10, 8, -12} 
		}; 
	
		print_dia(arr, n); 
		
	} 
}  