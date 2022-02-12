public class Calqlate {
    private double pointInCircle=0;
    private double pointInSquare=0;

    private double piApprox;

    public Calqlate(){

    }

    public void update(Boolean inCircle){
        if(inCircle==true){
            pointInCircle++;
            pointInSquare++;
        }else if(inCircle==false){
            pointInSquare++;
        }

        piApprox=4*(pointInCircle/pointInSquare);
    }

    public double getpiApprox(){
        return piApprox;
    }

}
