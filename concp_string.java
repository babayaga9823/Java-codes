import java.util.Collections;
import java.util.Arrays;
class dog 
{
    
    public static void main (String[] args) 
    {
        int z=0;
        char ch[] = new char[10];
        StringBuffer r=new StringBuffer();
        while(z<7)
        {
            int i=97+z;
         ch[z]=(char)i;
         r.append(ch[z]);
         z++;   
        }
        ch[z]='\0';
         r.append(ch[z]);
         System.out.print("Being Printed R "+r);
        String s=new String(ch);
        System.out.print(s.contains("de"));
        System.out.print(s);
        System.out.print("R printed "+s);
        for(int i=0;i<ch.length/2;i++)if(ch[i]==ch[ch.length-1-i])System.out.println("True");
        String p="Hello my World you know whom I am Taking about";
        String par[]=p.split(" ");
    //  for(int h=0;h<par.length;h++)System.out.println(par[h]);
        Arrays.sort(par,0,par.length-1);
        System.out.println("After Sorting");
        for(int h=0;h<par.length;h++)System.out.println(par[h]);
            System.out.println("Printing String r");
        
    }
    
    
}