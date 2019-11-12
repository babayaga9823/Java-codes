class table_facto
{
    static long fact(int n) 
    { 
        long res = 1, i; 
        for (i=2; i<=n; i++) 
            res *= i; 
        return res; 
    }

   public static void main(String []args)
   {

   		int n=2,i;
   		long []a;
   		a = new long[10];

   		for(i=1;i<=10; i++)
   		{
   			a[i-1] = fact(i*n);
   			System.out.println(n+" * "+i+" = "+n*i);
   		}
   		for(i=0;i<10; i++)
   		{
   			System.out.print(a[i]+" ");
   		}

   } 
}