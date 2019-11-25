interface cat
{
    void bilae();
}
class dog implements cat {
     public void bilae()
    {
      	System.out.println("Bilae kuhe meoww");  
    }
	public static void main (String[] args) {
		dog d=new dog();
		d.bilae();
		cat c=new cat()
		{
		      public void bilae()
        {
      	System.out.println("Moro Bilae kuhe meoww");  
        } 
       
		};
		 c.bilae();
	}
}