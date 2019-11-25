import java.io.*;
import java.util.*;
class file2
{
	public static void main(String[] args)
	{
		try
		{
			String s=null;
		System.out.println("From file dest");
		Scanner r=new Scanner(System.in);
		s=r.nextLine();
			File frm=new File(s);
			System.out.println("To file dest");
		//Scanner r=new Scanner(System.in);
		s=r.nextLine();
			File tof=new File(s);
			FileReader fr=new FileReader(frm);
			FileWriter fwr=new FileWriter(tof,true);
			int z=0;
			z=(int)fr.read();
			char c=(char)z;
			while(z!=-1)
			{
				fwr.write(z);
				z=(int)fr.read();
			}
			fr.close();
		 	fwr.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		// finally
		// {
		// 	fr.close();
		// 	fwr.close();
		// }
	}
}