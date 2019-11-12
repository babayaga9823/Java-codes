class prog74
{
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6};
        int n = arr.length; 
        System.out.println("Original Array");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < n; ++i)
        { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key)
            { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
        System.out.println("Sorted Array");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}