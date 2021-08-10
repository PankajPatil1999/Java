import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
class D2_shapes
{
       public static void main(String args[])
       {
          DrawFrame frame=new DrawFrame();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.show();
       }
}
class DrawFrame extends JFrame
{
    DrawFrame()
    {
          Toolkit kit=Toolkit.getDefaultToolkit();
          Dimension size=kit.getScreenSize();
          int width=size.width;
          int height=size.height;

          setSize(width/2,height/2);
          setTitle("Geometric shapes");
          setLocation(width/4,height/4);

          DrawPanel panel=new DrawPanel();
          Container contentPane = getContentPane();
          contentPane.add(panel);
   }
}
class DrawPanel extends JPanel
{
	   public void paintComponent(Graphics g)
	   {
		   super.paintComponent(g);
		   Graphics2D g2=(Graphics2D)g;

		   double leftx=100;
           double lefty=100;
           double width=200;
           double height=150;

           Rectangle2D rect=new Rectangle2D.Double(leftx,lefty,width,height);
           g2.setPaint(Color.red);
           g2.fill(rect);

            Ellipse2D ellipse=new Ellipse2D.Double(leftx,lefty,width,height);
		    g2.setPaint(Color.blue);
            g2.fill(ellipse);

            g2.draw(new Line2D.Double(leftx,lefty,leftx+width,lefty+height));

            double centrex=rect.getCenterX();
            double centrey=rect.getCenterY();
            double radius=50;

            Ellipse2D circle = new Ellipse2D.Double(centrex-150,centrey-130,(centrex+20)+radius,(centrey+20)+radius);
            g2.draw(circle);
		}
	}

