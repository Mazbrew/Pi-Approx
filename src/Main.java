public class Main {
    public static void main(String[] args) throws Exception {
        Calqlate calc = new Calqlate();
        Panel panel = new Panel(500, calc);
        Frame frame = new Frame(panel,calc);
        

        while(true){
            panel.makeNewPoint();
            frame.update();
        }
    }
}
