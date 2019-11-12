import java.util.Scanner; 
class _50strdig 
{
      public static void main(String args[])
      {
      Scanner sc = new Scanner(System.in); 
      String a = sc.nextLine(); 
      char[] b = a.toCharArray();
      StringBuilder sb = new StringBuilder();
      int p=0;
      for(char c : b)
      {
         if(Character.isDigit(c))
         {
            p++;
            if(p>0)
            {
            	break;
            }
         }
      }
      if(p==0)
      {
      	 System.out.println("NO");
      }
      else
      {
       System.out.println("YES");
      }
   }
}
