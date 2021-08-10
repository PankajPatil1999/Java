import java.io.*;

class palindrom
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n,m,r=0,f=0,a,b;

		System.out.println("Enter a number:");
		n=Integer.parseInt(br.readLine());
		System.out.println("Number is:"+n);
		b=n;

		while(n>0)
		{
			m=n%10;
			r=r*10+m;
			n=n/10;
		}
		System.out.println("Reservers "+r);

		a=r;

		if(b==a)
		System.out.println("number is palindrom");
		else
		System.out.println("number is not palindrom");
	}
}