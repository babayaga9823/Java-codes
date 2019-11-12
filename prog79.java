import java.util.*;
class prog79
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [10];
        System.out.println("Enter the element of array");
        for(int i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt(); 
        }
        System.out.println("The array is :");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Enter the element to be search");
        int f = sc.nextInt(), k = 0, j;
        System.out.println("Using Linear Search");
        for(j = 0; j < arr.length; j++)
        {
            if(arr[j] == f)
            {
                k = 1;
                break;
            }
        }
        if(k == 1)
        {
            System.out.println(f + " found at " + (j+1) + " position");
        }
        else
        {
            System.out.println("Element not found");
        }
        System.out.println("Using Binary Search");
        Arrays.sort(arr);
        System.out.println("Sorted array :");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        int l = 0, h = 10, mid = (l + h) / 2;
        k = 0;
        while(l <= h)
        {
            if(arr[mid] == f)
            {
                k = 1;
                break;
            }
            if(arr[mid] < f)
            {
                l = mid + 1;
            }
            if(arr[mid] > f)
            {
                h = mid - 1;
            }
            mid = (l + h) / 2;
        }
        if (k == 1) 
        {
            System.out.println(f + " found at " + (mid + 1) + " position");
        } 
        else
        {
            System.out.println("Element not found");
        }
    }
}