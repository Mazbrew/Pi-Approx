import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Frame extends JFrame{
    private final int swidth = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private final int sheight = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private Calqlate calc;

    public Frame(Panel panel, Calqlate calc){
        super();
        this.calc=calc;

        int contentWidth=panel.getWidth();
        int contentHeight=panel.getHeight();
        this.setLayout(null);
        this.getContentPane().setPreferredSize(new Dimension(contentWidth,contentHeight));
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(swidth/2-contentWidth/2,sheight/2-contentWidth/2);
        this.setVisible(true);
        this.add(panel);
    }

    public void update(){
        this.setTitle(String.valueOf(calc.getpiApprox()));
    }
}
