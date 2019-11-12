import java.util.*;
class prog73
{
    public static void main(String args[])
    {
        Integer arr[] = {1, 2, 2, 4, 5, 4, 7, 8, 8, 8};
        System.out.println("The Original array is :");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Distinct Elements are :");
        System.out.println(set);
    }
}