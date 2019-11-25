class togle
{
	static void dog(String s)
	{
		String r=s;
		String q[]=r.split("\\s");
		String g="";
		for(String i:q)
		{
			StringBuffer b=new StringBuffer(i);
			b.reverse();
			String f=b.substring(0,1);
			String res=b.substring(1);
			g+=f.toLowerCase()+res.toUpperCase()+" ";
		}
		System.out.println(g);
	}
	public static void main(String[] args)
	{
		String s="my name is kutiya";
		dog(s);
	}
}