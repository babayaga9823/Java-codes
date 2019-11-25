import java.io.*;
class did
{
	public static void main(String[] args)
	{
		try
		{
			File f=new File("B.txt");
			FileReader r=new FileReader(f);
			int z;
			z=r.read();
			while(z!=-1)
			{
				System.out.print((char)z);
				z=r.read();
			}
			r.close();
		}
		catch(IOException ed)
		{
			System.out.println(ed+"Successful");
		}
	} 


}