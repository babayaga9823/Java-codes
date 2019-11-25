class dog
{
    static class cat
    {
         void catty()
        {
           System.out.println("Cat is fun"); 
        }
           static void doggu()
         {
        System.out.println("Doggu is fun");
        //catty();
        }
        
    }
 
}
class mat {
	public static void main (String[] args) {
		dog.cat.doggu();
    //	dog.cat.catty();no static method cannot be accessed directly
		dog.cat d=new dog.cat();
		d.catty();
	}
}