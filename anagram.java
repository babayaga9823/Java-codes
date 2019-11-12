import java.util.*;

class anagram { 


	static boolean shouldSwap(char str[], int start, int curr) { 
		for (int i = start; i < curr; i++) { 
			if (str[i] == str[curr]) { 
				return false; 
			} 
		} 
		return true; 
	} 

	static void findPermutations(char str[], int index, int n) { 
		if (index >= n) { 
			System.out.println(str); 
			return; 
		} 

		for (int i = index; i < n; i++) { 

 
			boolean check = shouldSwap(str, index, i); 
			if (check) { 
				swap(str, index, i); 
				findPermutations(str, index + 1, n); 
				swap(str, index, i); 
			} 
		} 
	} 

	static void swap(char[] str, int i, int j) { 
		char c = str[i]; 
		str[i] = str[j]; 
		str[j] = c; 
	} 

	// Driver code 
	public static void main(String[] args) {
		String s;
		Scanner in = new Scanner (System.in);
		s = in.nextLine();
		char str[] = s.toCharArray() ; 
		int n = str.length; 
		findPermutations(str, 0, n); 
	} 

} 
