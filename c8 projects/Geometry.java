package geometry;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Geometry {

public static double r;
public static double h; 
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
    r = sc.nextDouble();
        System.out.println("Enter height: ");
    h = sc.nextDouble();
        System.out.println("Sphere volume: " + sphereVolume(/*r*/));
        System.out.println("Cylinder volume: " + cylinderVolume(/*r,h*/));
    }
    public static double sphereVolume(/*double */){
    double svol=(1.3333)*(Math.PI)*(Math.pow(r,3));
    return svol;
    }
    
     public static double cylinderVolume(/*double r, double h*/){
    double cvol=(Math.PI)*(Math.pow(r, 2))*h;
    return cvol;
    }
    
}
