import java.io.*;
class cpyapnd
{

public static void main(String[] args)
{

	try{
		File f1=new File("B.txt");
	File f2=new File("A.txt");
	FileWriter w1=new FileWriter(f1,true);
	FileReader r1=new FileReader(f2);
	int z;
	z=r1.read();
	while(z!=-1)
	{
		w1.write((char)z);
		z=r1.read();
	}
		r1.close();
		w1.close();
	}
	catch(Exception i)
	{
		System.out.print("LOl Exception caught");
	}
	finally
	{
		System.out.print("Finally block executed");
	}

}

}