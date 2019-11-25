import java.io.*;
class hero
{
    static hero h=new hero();
    private hero()
    {
        
    }
    static public hero marvel()
    {
        System.out.println("Its working");
        return h;
    }
}
class cat {
	public static void main (String[] args) {
		hero h1=hero.marvel();
	}
}