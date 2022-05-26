package sodacan;

/**
 *
 * @author awl5472
 */
public class SodaCan {
public int height;
public int radius;
public SodaCan(){
    height=2;
    radius=3;
}

    public static void main(String[] args) {
     
    }
    public double getSurfaceArea(){
        double SA=(2*Math.PI*radius*height+2*Math.PI*(radius*radius));
        return SA;
    }
    public double getVolume(){
        double V=(Math.PI*(radius*radius)*height);
        return  V;
    }
    
}
