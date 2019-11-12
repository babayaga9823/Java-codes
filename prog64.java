import java.util.*;

import javax.lang.model.util.ElementScanner6;
class prog64
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String str, temp = "", fstr = "";
        char ch, ch1;
        int i, len;
        System.out.println("Enter the data");
        str = sc.nextLine();
        len = str.length();
        if(len > 3)
        {
            for (i = 0; i < len; i++) 
            {
                ch = str.charAt(i);
                if(ch >= 65 && ch <= 90)
                {
                    int d = (char)(ch);
                    d = (d + 13) % 90;
                    if(d < 65)
                    {
                        ch1 = (char)(65 + d - 1);
                    }
                    else
                    {
                        ch1 = (char)(d);
                    }
                }
                else if(ch >= 97 && ch <= 122)
                {
                    int d = (char)(ch);
                    d = (d + 13) % 122;
                    if (d < 90) 
                    {
                        ch1 = (char) (97 + d - 1);
                    } 
                    else 
                    {
                        ch1 = (char) (d);
                    }
                }
                else 
                {
                    ch1 = ch;
                }
                fstr = fstr + ch1;
            }
            System.out.println("The Cipher text is :");
            System.out.println(fstr);
        }
        else
        {
            System.out.println("INVALID LENGTH");
        }
    }
}