package project.c34;
import java.util.Scanner;
/**
 *
 * @author Aaron
 */
public class ProjectC34 {
  
 public static void main(String[] args) {
    int soldTickets = 0;
    int buyers =0;
    while (soldTickets<100){
        System.out.println("How many tickets would you like to buy (up to 4)?");
        Scanner sc = new Scanner(System.in);
        int numberOfTickets = sc.nextInt();
        if (numberOfTickets>4){
            System.out.println("You can only buy up to 4 tickets!");
        }
        else if (soldTickets+numberOfTickets>100){
            System.out.println("You must buy less tickets than this");
        }
        else{
            soldTickets+=numberOfTickets;
        buyers++;
        }
    }
    if (soldTickets>99){
        System.out.println(buyers);
    }
       
   } 
     
}