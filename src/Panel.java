import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private int size;
    private Calqlate calc;

    private Point point;

    private int pointSize=2;

    public Panel(int size,Calqlate calc){
        super();
        this.size =size;
        this.calc = calc;
        this.setBounds(0,0,size,size);
    }

    public void makeNewPoint(){
        point = new Point(this,calc);
        drawNewPoint(getGraphics());
    }

    public void paint(Graphics g){
        g.setColor(new Color(214,214,214));
        g.fillRect(0, 0, size, size);
    }

    public void drawNewPoint(Graphics g){
        if(point.getInCircle()==true){
            g.setColor(new Color(255,0,0));
        }else if(point.getInCircle()==false){
            g.setColor(new Color(0,0,255));
        }
        
        g.fillOval(point.getX()-pointSize/2,point.getY()-pointSize/2,pointSize,pointSize);
    }
}
