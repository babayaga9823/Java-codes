class parentthrd extends Thread
{
	
	public void run()
	{
		System.out.println(" Process Running Started ");
	}
	public static void main(String[] args)
	{
		parentthrd pth=new parentthrd();
		pth.start();
	}
}