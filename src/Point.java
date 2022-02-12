import java.util.Random;

public class Point {
    private static int max;
    private static int mid;
    private static final int min = 0;
    private double dist;

    private Random rnd = new Random();

    private int x;
    private int y;
    private boolean inCircle;

    public Point(Panel panel, Calqlate calc){
        max = (int)panel.getSize().getHeight();
        mid = max/2;

        inCircle=true;
        x= rnd.nextInt(max + 1 - min) + min;
        y= rnd.nextInt(max + 1 - min) + min;
        
        dist= Math.sqrt(Math.pow((x-mid),2)+Math.pow((y-mid),2));

        if(dist>mid){
            inCircle=false;
        }

        calc.update(inCircle);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Boolean getInCircle(){
        return inCircle;
    }
}
