import java.util.*;

class num2word
{

	public static void main(String []args)
	{
		int n = 45;
		int m,l=0;
		m=n;
		while(m>0)
		{
			m=m/10;
			l++;
		}

		String[] str = new String[l];


		m=0;
		int t;
		while(m<l)
		{
			t = n%10;
			n=n/10;

			switch(t)
			{
				case 0:
					str[l-m-1]="Zero";
					break;

				case 1:
					str[l-m-1]="One";
					break;					
				case 2:
					str[l-m-1]="Two";
					break;
				case 3:
					str[l-m-1]="Three";
					break;
				case 4:
					str[l-m-1]="Four";
					break;

				case 5:
					str[l-m-1]="Five";
					break;

				case 6:
					str[l-m-1]="Six";
					break;
				case 7:
					str[l-m-1]="Seven";
					break;
				case 8:
					str[l-m-1]="Eight";	
					break;
				case 9:
					str[l-m-1]="Nine";
					break;
			}	
			m++;
		}

		for(int i=0; i<l; i++)
			System.out.print(str[i]+" ");
	}
}