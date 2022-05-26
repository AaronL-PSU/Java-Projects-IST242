package income;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Income {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your income?");
        int inc = sc.nextInt();
        System.out.println("How many children do you have?");
        int child = sc.nextInt();
        System.out.println(Assistance(inc,child));
       
    }
    public static String Assistance(int inc, int child){
         String assist ="";
        if ((inc>30000 && inc<40000) && child>=3){
           assist =("Assistance is: $1000 per child.");    
        }
        else if ((inc>20000 && inc<30000) && child>=2){
           assist =("Assistance is: $1500 per child."); 
        }
        else if (inc<20000){
           assist =("Assistance is: $2000 per child."); 
        }
        else if (child==-1){
           assist =("Assistance is: $0 per child."); 
        }
        return assist;
    }
}