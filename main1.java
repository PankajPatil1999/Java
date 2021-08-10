import java.io.*;

class base
{
	int m1,m2,m3,sum,avg;
	void get()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter english marks:");
		m1=Integer.parseInt(br.readLine());
		System.out.println("Enter physics marks:");
		m2=Integer.parseInt(br.readLine());
		System.out.println("Enter biology marks:");
		m3=Integer.parseInt(br.readLine());
		System.out.println("Enter english marks:"+m1);
		System.out.println("Enter physics marks:"+m2);
		System.out.println("Enter biology marks:"+m3);
	}
}
class d extends base
{
	void per()
	{
		sum=m1+m2+m3;
		avg=sum/3;
		System.out.println("percentage is:"+avg);
	}
}

class main1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		d d=new d();


		d.get();
		d.per();
	}
}