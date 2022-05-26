package door;

/**
 *
 * @author Aaron
 */
public class Door {
    
private String name; //variables
private String state;

public Door(String name,String state){ //constructor
    
}

    public static void main(String[] args) {
        Door frontDoor = new Door("Front", "open");
        System.out.println("The front door is " + frontDoor.getState());
        Door backDoor = new Door("Back", "closed");
        System.out.println("The back door is " + backDoor.getState());   
        Door sideDoor = new Door("Side", "closed");
        System.out.println("The side door is " + sideDoor.getState()); 
    }
    public void open(){ //methods
        
    }
    public void close(){
        
    }
    
    public String getName(){//accessor methods
        return name;
    }
     public String getState(){
        return state;
    }
     public void setName(String newName){//mutator methods
         name=newName;
     }
     public void setState(String newState){
         state=newState;
     }
     
     
}        