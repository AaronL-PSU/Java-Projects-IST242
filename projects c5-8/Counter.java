package counter;

/**
 *
 * @author Aaron
 */
public class Counter {
    public static void main(String[] args) {
        int max=10;
        int i=0;
        
       while (i<12){
           i++;
           setLimit(max,i);
       }
    }
    public static void setLimit(int max, int i){
        if (i>max){
            System.out.println("Limit exceeded");
        }
    }
}
