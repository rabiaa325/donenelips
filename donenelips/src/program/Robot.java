
package program;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Robot {
    public int x;
    public int y;
    public double aci;
    
    public Robot (int x,int y,double aci){
        this.x=x;
        this.y=y;
        this.aci=aci;
    }

    
    public void Ciz (Graphics g1){
        Graphics2D g2=(Graphics2D ) g1;
        
        Shape r1=new Ellipse2D.Float(this.x,this.y,50,30);
        
        g2.setPaint(Color.YELLOW);
        g2.fill(r1);
        g2.setStroke(new BasicStroke(2));
        g2.setPaint(Color.BLACK);
        g2.draw(r1);
        
        
    }

    
}
