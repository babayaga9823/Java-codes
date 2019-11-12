// 5. WAP of Exception Handling which is not having catch block.

public class T2_5
{
    public static void main(String args[])
    {
        try {
            System.out.println(10/0);
            System.out.println("in Try Block");
        }
        finally {
            System.out.println("in Finally Block");
        }
    }
}