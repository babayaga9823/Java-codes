class mythread extends Thread
{
	static int z=0;
	int m;
	mythread(){
		z++;
		System.out.println("*******"+z);
		m=z;
	}
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())System.out.println("Daemon Thread");
		else System.out.println("User Thread");
		for(int i=0;i<6;i++)System.out.println(i+" Of object "+m);
	}

public static void main(String[] args)
{
try
{
mythread th1=new mythread();//1
mythread th2=new mythread();//2
mythread th3=new mythread();//3
mythread th4=new mythread();//4
th3.setDaemon(true);
//th3.start();
th4.start();
th1.start();
th4.join();
th2.start();
th2.setPriority(MAX_PRIORITY);
}
catch(Exception e)
{

}
}

}
