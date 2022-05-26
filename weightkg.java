import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    double weight = 0;
    double kg = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter weight (lbs) ");
     weight = sc.nextDouble();
     kg = (weight*0.453592);
     System.out.println("Weight in kg: " + kg);
    }
}