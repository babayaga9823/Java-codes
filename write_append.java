import java.io.*;
class file2
{
	public static void main(String[] args)
	{
		try{
		File f1=new File("B.txt");
		FileWriter r=new FileWriter(f1,true);
		String s="Yo Yo Honey Singh";
		r.write(s);
		r.close();
		}
		catch(Exception e)
		{

		}
	}
}