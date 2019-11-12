import java.util.*;

import javax.lang.model.util.ElementScanner6;
class prog66
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[20];
        int i;
        System.out.println("Enter the elements of array");
        for(i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Original array is :");
        for (i = 0; i < 10; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("1 for Bubble sort");
        System.out.println(" 2 for Selection sort");
        int ch = sc.nextInt();
        if(ch == 1)
            bubblesort(arr);
        else if(ch == 2)
            selectionsort(arr);
        else 
            System.out.println("Wrong choice");
    }
    public static void bubblesort(int arr[])
    {
        int i, j, temp;
        for(i = 0; i < 10; i++)
        {
            for(j = 0; j < 10 - i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Bubble Sort");
        for (i = 0; i < 10; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void selectionsort(int arr[])
    {
        int i, j, temp, smallest, pos;
        for(i = 0; i < 10 - 1; i++)
        {
            smallest = arr[i];
            pos = i;
            for(j = i+1; j < 10; j++)
            {
                if(arr[j] < smallest)
                {
                    smallest = arr[j];
                    pos = j;
                }
            }
            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Selection Sort");
        for (i = 0; i < 10; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}