import java.io.*;
class Vowel
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        char ch;
        System.out.println("Enter a character");
        ch = (char)in.read();
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println(ch + " is Vowel");
        }
        else
        {
            System.out.println(ch + " is Consonant");
        }
    }
}