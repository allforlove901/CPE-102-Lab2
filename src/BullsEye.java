import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
   Draws a bull's eye.
 */
public class BullsEye
{
	Ellipse2D.Double circ1, circ2, circ3, circ4, circ5;
	
   /**
      Creates a new instance of BullsEye.
      @param r the radius
      @param x the center x-coordinate
      @param y the center y-coordinate
    */
   public BullsEye(double r, double x, double y)
   {
	  circ1 = new Ellipse2D.Double(x,y,r,r);
      circ2 = new Ellipse2D.Double(x+10,y+10,r-20,r-20);
      circ3 = new Ellipse2D.Double(x+20,y+20,r-40,r-40);
      circ4 = new Ellipse2D.Double(x+30,y+30,r-60,r-60);
      circ5 = new Ellipse2D.Double(x+40,y+40,r-80,r-80);

   }
   
   /**
      Draws the bull's eye.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
	  g2.setColor(Color.BLACK);
	  g2.fill(circ1);
	  
	  g2.setColor(Color.WHITE);
	  g2.fill(circ2);
	  
	  g2.setColor(Color.BLACK);
	  g2.fill(circ3);
	  
	  g2.setColor(Color.WHITE);
	  g2.fill(circ4);
	  
	  g2.setColor(Color.BLACK);
	  g2.fill(circ5);
   }
   
}