/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labeled.point;

/**
 *
 * @author Aaron
 */
public class LabeledPoint {
    public int x;
    public int y;
    public String label;
public LabeledPoint(int x, int y, String label){
    x=1;
    y=1;
    label="B";
}

public void print(){
    System.out.println(x);
    System.out.println(y);
    System.out.println(label.toString());
}

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}