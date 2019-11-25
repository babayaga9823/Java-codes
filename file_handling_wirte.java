import java.io.*;
class filee1
{
	public static void main(String[] args)
	{
		try{
			File f1=new File("AAa.txt");
		// f1.open();
		FileWriter r=new FileWriter(f1);
		String s="Yo Yo Honey Singh";
		r.write(s);
		r.close();
		}
		catch(Exception e)
		{

		}
	}
}