import starter.*;
import java.util.*;
class maincourse
{
	int z;
	void mainmenu()
	{
		Scanner s=new Scanner(System.in);
		z=s.nextInt();
		System.out.println("Number maincourse dishes orderd = "+z);
	}
	public static void main(String[] args)
	{
		maincourse mn=new maincourse();
		vgstarter vg=new vgstarter();
		mn.mainmenu();
		vg.menu();
	}
}