import java.io.*;
class DecToBin1
{
      public static void main(String args[])
      {
          InputStreamReader in=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(in);
          System.out.println("enter decimal no.");
          try
          {
               int no=Integer.parseInt(br.readLine());
               int m;
               int sum=0;
               int i=0;
               int a[]=new int[10];
               while(no!=0)
               {
                     a[i]=no%2;
                     no=no/2;
                     i++;
               }
               System.out.println("corresponding binary number:");
               for(int j=i-1;j>=0;j--)
                 System.out.print(" "+a[j]);
                 System.out.println();

            }
            catch(IOException io)
            {
                System.out.println("Invalid Number");
            }
            catch(NumberFormatException io)
            {
                  System.out.println("Invalid Number");
            }
        }
  }
