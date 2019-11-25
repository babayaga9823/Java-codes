import java.io.*;
class myfile{

public static void main(String[] args)
{
try
{
File myfstfile= new File("A.txt");
FileReader red=new FileReader(myfstfile);
FileReader red2=new FileReader(myfstfile);
//myfstfile.open();
// FileWriter r=new FileWriter(myfstfile);
String s=" Red My princess";
int z,y;
while(z!=-1)
{
	z=red.read();
	if(z!=-1)y=red2.read();
}
FileWriter r=new FileWriter(red2);
r.write(s);
r.close();
}
catch(Exception e)
{

}


}	
}