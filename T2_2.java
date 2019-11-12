//2. Write a Java Singleton class example using private constructor.
import java.io.*;

class TestSingleton
{
    static TestSingleton instance = null;
    public int x = 10;
    private TestSingleton() {}
    static public TestSingleton getInstance()
    {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }
}

class T2_2
{
    public static void main(String args[])
    {
        TestSingleton a = TestSingleton.getInstance();
        TestSingleton b = TestSingleton.getInstance();
        a.x = a.x + 10;
        System.out.println(a.x);
        System.out.println(b.x);
    }
}