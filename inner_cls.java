class outer
{
	outer()
	{
		System.out.println("Outer Class Formed");
	}
	int a=89,b=989;
	class inner
	{
		inner()
		{
			System.out.println("Inner Class Formed and can access "+(a+100)+" and "+b);
		}

	}
	public static void main(String[] args)
	{
		outer ot=new outer();
		outer.inner itn =ot.new inner();

	}
}