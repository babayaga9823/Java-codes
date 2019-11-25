class dog
{
	 class cat
	{
		static void kitty()
		{
			System.out.println("Its Kitty Maaan");
		}
		void kukura()
		{
			System.out.println("Its kukura Maaan");
		}
	}
}
class human
{
	public static void main(String[] args)
	{
		dog.cat bile=new dog.cat();
		bile.kitty();
		bile.kukura();
		System.out.println("Its khatra");
		dog.cat.kitty();
	}
}