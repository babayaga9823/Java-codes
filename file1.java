import java.io.*;
import java.util.*;
class file1
{
	public static void  main(String[] args)
	{
		try
		{
			String s=null;
			Scanner r=new Scanner(System.in);
			s=r.nextLine();
			File f=new File(s);
			if(f.createNewFile())System.out.println("File created ");
			else System.out.println("File exists ");
		File g[]=f.listFiles();
		for(File i:g)System.out.println(i.getName());
			if (f.mkdir()) { 
  
            // display that the directory is created 
            // as the function returned true 
            System.out.println("Directory is created"); 
        } 
        else { 
            // display that the directory cannot be created 
            // as the function returned false 
            System.out.println("Directory cannot be created"); 
        } 

		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}