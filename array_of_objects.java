class dog {
    dog()
    {
        System.out.println("Dog created");
    }
	public static void main (String[] args) {
        
        dog d[]=new dog[10];
        for(int i=0;i<10;i++)d[i]=new dog();
        
    	
	}
}