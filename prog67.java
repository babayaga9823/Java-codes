class prog67
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int brr[] = {3,4,5,6,7};
        System.out.println("The first array is :");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The second array is :");
        for (int i : brr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The common elements are :");
        for(int i : arr)
        {
            for(int j : brr)
            {
                if(i == j)
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}