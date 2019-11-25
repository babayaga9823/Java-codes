import java.io.*;
class moroExpt extends Exception
{
	public moroExpt(String s)
	{
		super(s);
	}
}
class expthand
{
	public static void main(String[] args)
	{
		int a=99,b=9;
		try
		{
			if(a<b)throw new IOException("LOLLY");
			else throw new moroExpt("HONEY-SINGH");
		}
		catch(IOException e)
		{
			System.out.println("My exception caught "+e);
		}

		catch(moroExpt f)
		{
			System.out.println("********"+f+"*******");
			System.out.println("Moro defined exception caught "+f);
		}
		catch(Exception g)
		{
			System.out.println("General exception caught "+g);
		}
		finally
		{
			System.out.println("Bye Bye");
		}
	}
}