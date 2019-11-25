class outers
{

static class inners
{
inners()
{
	System.out.print(" static inner class ");
}

}
public static void main(String[] args)
{
	outers.inners ot=new outers.inners();

}


}