
package program;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.*;





import javax.swing.JFrame;



public class Dunya extends JFrame  {
    Robot R=new Robot(80,80,0);
     Yorunge Y=new Yorunge(200,200,100);

    
    public static final int BOYUT =600;

   
    public void paint (Graphics g){
        //dünya ciz
        g.clearRect(0, 0, BOYUT, BOYUT);
        g.setColor (Color.BLUE );
        g.drawRect(20, 40, BOYUT-40, BOYUT-60);
       
        R.Ciz(g);
    }

    public Robot getR() {
        return R;
    }

   

    public static int getBOYUT() {
        return BOYUT;
    }
    
    
    public Dunya (){
        
        this.setSize(BOYUT,BOYUT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Robot Dünyasi");
        
        
   
    }

    public void Hareketlendir() throws InterruptedException {
       for (int aci=0;aci<360;aci=aci+10){
           R .x=(int)(Y. x +Y.r*cos(Math.toRadians(aci)));
           R .y=(int)(Y. y +Y.r*sin(Math.toRadians(aci)));
           repaint();
           Thread.sleep(100);
       }
    }
}
