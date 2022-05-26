package vendingmachine;

/**
 *
 * @author Aaron
 */
public class VendingMachine {
private int numCans;
private int tokens;
public VendingMachine(){
    numCans=10;
    tokens=0;
}
public VendingMachine(int cans){
    numCans=cans;
    tokens=0;
}
    public static void main(String[] args) {
        
        VendingMachine machine = new VendingMachine();
        VendingMachine machinefill = new VendingMachine(50);
       //machine.fillUp(10);
        
        machine.insertToken();
        machine.insertToken();
        
        System.out.print("Token count: ");
        System.out.println(machine.getTokenCount());
        System.out.print("Can count: ");
        System.out.println(machine.getCanCount()); 

    }

public void fillUp(int cans){
        numCans+=cans;
    };
public void insertToken(){
    if (numCans > 0){
    tokens++;
    numCans+=-1;
    }
};
public int getCanCount(){
    return numCans;
};
public int getTokenCount(){
    return tokens;
};
    
}
