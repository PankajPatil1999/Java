import java.io.* ;
public class palindrom1
{
public static void main(string[] s)
{
	int,num,n,rev,rem;
	rev=0;
	String=s1;
	System.out.println("Enter the number");
	try
	 {
		DataInputStream d=new DataInputStream(System.in);
		s1=dreadLine();
		num=Integer.parseInt(s1);
		n=num;
		while(num>0)
		{
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
	    }
	    system.out.println("REVERSE="+rev);
	    if(n==rev)
	    system.out.println("PALINDROM");
	    else
	    System.out.println("NOT PALINDROM");
     }
     catch(Exception e)
      {
	  System.out.println(e);
      }
   }
}
