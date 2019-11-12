import java.util.*;
import java.lang.*;
class prog80
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String str, temp = "";
        char ch;
        int i, len;
        System.out.println("Enter the string");
        str = sc.nextLine();
        len = str.length();
        for(i = 0; i < len; i++)
        {
            ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch = Character.toLowerCase(ch);
            }
            else
            {
                ch = Character.toUpperCase(ch);
            }
            temp = temp + ch;
        }
        System.out.println(temp);
    }
}