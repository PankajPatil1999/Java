import java.io.*;
public class bin_deci
{
  public static void main(String []args) throws IOException
  {
    int bin;
    double dec=0;
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.print("ENTER THE BINARY NO:");
    bin=Integer.parseInt(br.readLine());
    for(int i=0;bin>0;i++)
    {
       dec=dec+(bin%10)*Math.pow(2,i);
       bin=bin/10;
    }
    System.out.println("\n THE EQUIVALENT DECIMAL NO IS :"+dec);
  }
}