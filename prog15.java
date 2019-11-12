class prog15
{
    public static void main(String args[])
    {
        long f = 1, fact = 1;
        for(int i = 1; ; i++)
        {
            f = f * i;
            if(f < 0)
            {
                break;
            }
            fact = i;
        }
        System.out.println("The largest value is " +fact);
    }
}