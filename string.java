import java.io.*;

class base
{
	int marks;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	marks=Integer.parseInt(br.readLine());
}

class String extends base
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		derived d=new derived();

	}
}


