import java.io.*; 

public class lrge_smllSum
{
     static int getSum(int n) 
    { 
        int sum; 
  
        /* Single line that calculates sum */
        for (sum = 0; n > 0; sum += n % 10, 
                                  n /= 10); 
  
        return sum; 
    }

    public static void main(String[] args)
    {
        int numbers[] = new int[]{33,53,73,94,22,45,23,87,13,63};
        int smallest = numbers[0];
        int biggest = numbers[0];
           
        for(int i=1; i< numbers.length; i++)
        {
                if(numbers[i] > biggest)
                        biggest = numbers[i];
                else if (numbers[i] < smallest)
                        smallest = numbers[i];
               
        }
       
        System.out.println("Largest Number digit sum is : " + getSum(biggest));
        System.out.println("Smallest Number digit sum is : " + getSum(smallest));
    }
}












