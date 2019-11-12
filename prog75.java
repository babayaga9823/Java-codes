class prog75
{
    public static void main(String args[])
    {
        String str = "  Hello    sentence with extra     space     .";
        System.out.println("Original String is : " + str);
        String after = str.trim().replaceAll(" +", " ");
        System.out.println("New String is : " + after);
    }
}