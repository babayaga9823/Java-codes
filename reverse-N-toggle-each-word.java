class rvstg
{
	static void fog(String s)
	{
	    StringBuffer a=new StringBuffer();
	    String ya[]=s.split("\\s");
		for(String j:ya)
		{
			StringBuffer b=new StringBuffer(j);
			b.reverse();
			String e=b.toString();
			for(int i=0;i<e.length();i++)
			{
				int z=(int)e.charAt(i);
				if(z>=97&&z<=122)
				{
					int y=z-32;
					char c=(char)y;
					a.append(c);
				}
				else 
				{

					int y=z+32;
					char c=(char)y;
					a.append(c);
				}
				
			}
			a.append(" ");
		}
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		String d="tHis Is MirZaPUR";
		fog(d);
	}
}