// Java program to find 
// Determinant of a matrix 
class invertible
{ 

	// Dimension of input square matrix 
	static int N = 4; 
	
	// Function to get cofactor 
	// of mat[p][q] in temp[][]. 
	// n is current dimension 
	// of mat[][] 
	static void getCofactor(int [][]mat, int [][]temp, 
							int p, int q, int n) 
	{ 
	int i = 0, j = 0; 

	// Looping for each 
	// element of the matrix 
	for (int row = 0; row < n; row++) 
	{ 
		for (int col = 0; col < n; col++) 
		{ 
			// Copying into temporary matrix 
			// only those element which are 
			// not in given row and column 
			if (row != p && col != q) 
			{ 
				temp[i][j++] = mat[row][col]; 

				// Row is filled, so increase 
				// row index and reset col index 
				if (j == n - 1) 
				{ 
					j = 0; 
					i++; 
				} 
			} 
		} 
	} 
	} 

	/* Recursive function for finding 
	determinant of matrix. n is current 
	dimension of mat[][]. */
	static int determinantOfMatrix(int [][]mat, 
								int n) 
	{ 
	int D = 0; // Initialize result 

	// Base case : if matrix 
	// contains single element 
	if (n == 1) 
		return mat[0][0]; 
		
	// To store cofactors 
	int [][]temp = new int[N][N]; 
	
	// To store sign multiplier 
	int sign = 1; 

	// Iterate for each 
	// element of first row 
	for (int f = 0; f < n; f++) 
	{ 
		// Getting Cofactor of mat[0][f] 
		getCofactor(mat, temp, 0, f, n); 
		D += sign * mat[0][f] * 
			determinantOfMatrix(temp, n - 1); 

		// terms are to be added 
		// with alternate sign 
		sign = -sign; 
	} 

	return D; 
	} 

	static boolean isInvertible(int [][]mat, int n) 
	{ 
		if (determinantOfMatrix(mat, N) != 0) 
			return true; 
		else
			return false; 
	} 

	// Driver Code 
	public static void main(String []args) 
	{ 
		int [][]mat = {{1, 0, 2, -1 }, 
					{3, 0, 0, 5 }, 
					{2, 1, 4, -3 }, 
					{1, 0, 5, 0 }}; 
		if (isInvertible(mat, N)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 

// This code is contributed 
// by ChitraNayal 
