package project.c34;
import java.util.Scanner;
/**
 *
 * @author Aaron
 */
public class ProjectC34 {

    public static void main(String[] args) {
        
      System.out.println("Enter a month (by number)");
      Scanner sc = new Scanner(System.in);
      int month = sc.nextInt();
      System.out.println("Enter a day");
      int day = sc.nextInt();
      System.out.println(season(month,day));
      
    }
public static String season(int month, int day){
    String season="";
    if (month==1 || month==2 || month==3){
        season="Winter";
    }
    else if (month==4 || month==5 || month==6){
        season="Spring";
    }
    else if (month==7 || month==8 || month==9){
        season="Summer";
    }
    else if (month==10 || month==11 || month==12){
        season="Fall";
    }
    if ((month%3==0)&& day>=21){
        if (season=="Winter"){
            season="Spring";
        }
        else if (season=="Spring"){
            season="Summer";
        }
        else if(season=="Summer"){
            season="Fall";
        }
        else{
            season="Winter";
        }
    }
    return season;
}
    
}
