import java.io.*;
class student
{
   String name;
   int rno;
   student(String n,int r)
   {
       name=n;
       rno=r;
   }
   void show()
   {
      System.out.println("  ");
      System.out.println("The name is "+name);
      System.out.println("The roll number is  "+rno);
   }
}
class sport extends student
{
   int sports_point;
   sport(String n,int r, int sp)
   {
       super(n,r);
       sports_point=sp;
   }
   void disp()
   {
      show();
      System.out.println("The sport points are "+sports_point+ "point ");
   }
}
class result extends sport
{
   int m1,m2,m3;
   result(String n,int r, int s1,int s2,int s3,int sp)
   {
       super(n,r,sp);
       m1=s1;
       m2=s2;
       m3=s3;
   }
   void cal()
   {
	   float p;
	   p=(int)(m1+m2+m3)/3;
	   System.out.println(" ");
	   System.out.println("The marks obtained in subject1 is "+m1);
	   System.out.println("The marks obtained in subject1 is "+m2);
	   System.out.println("The marks obtained in subject1 is "+m3);
	   System.out.println(" ");
	   System.out.println("The percentage are "+p+"%");
   }
}
public class inheritance
{
	public static void main(String []args)
	{
		DataInputStream in=new DataInputStream(System.in);
		int r=0,m1=0,m2=0,m3=0,sp=0;
		String n.str1;
		n=new String(" ");
		System.



