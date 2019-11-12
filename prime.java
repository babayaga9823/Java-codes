// Java program to find sum of 
// primes in given array. 
import java.util.*; 

class prime
{
	static int primeSum(int arr[], int n) 
	{ 
		////.....SIEVE OF ERATOSTHENE........./////
		int max_val = Arrays.stream(arr).max().getAsInt();

		Vector<Boolean> prime = new Vector<>(max_val + 1); 
		for(int i = 0; i < max_val + 1; i++) 
			prime.add(i,Boolean.TRUE); 

		prime.add(0,Boolean.FALSE); 
		prime.add(1,Boolean.FALSE); 
		for (int p = 2; p * p <= max_val; p++) 
		{ 

			if (prime.get(p) == true) 
			{
				for (int i = p * 2; i <= max_val; i += p) 
					prime.add(i,Boolean.FALSE); 
			} 
		}

		int sum = 0;
		for (int i = 0; i < n; i++)
			if (prime.get(arr[i]))
				sum += arr[i]; 

		return sum; 
	}

	public static void main(String[] args) 
	{ 
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 11}; 
		int n = arr.length; 
		System.out.print(primeSum(arr, n)+"\n"); 
	}
}