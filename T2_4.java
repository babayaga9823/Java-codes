// 4. WAP that creates java custom Exception.

class CustomException extends Exception
{
    public CustomException(String str)
    {
        super(str);
    }
}

public class T2_4
{
    public static void main(String args[])
    {
        try {
            throw new CustomException("Hello World!");
        }
        catch (CustomException e)
        {
            System.out.println("catching exceptioon");
            System.out.println(e);
        }
    }
}