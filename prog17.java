class prog17
{
    public static void main(String args[])
    {
        int i, j, c = 0;
        for(i = 1; i <= 1000; i++)
        {
            for(j = 1; j <= i; j++)
            {
                if(i % j == 0)
                {
                    c = c + 1; 
                }
            }
            if(c == 2)
            {
                System.out.print(i + " ");
            }
            c = 0;
        }
        System.out.println();
    }
}