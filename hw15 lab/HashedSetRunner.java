package hashedsetrunner;

import java.util.HashSet;

/**
 *
 * @author Aaron
 */
public class HashedSetRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("aaa");
        myHashSet.add("bbb");
        myHashSet.add("ccc");
        myHashSet.add("ddd");
        myHashSet.add("eee");
        myHashSet.add("fff");
        myHashSet.add("ggg");
        myHashSet.add("hhh");
        myHashSet.add("iii");
        myHashSet.add("aaa");
        myHashSet.add("bbb");
        myHashSet.add("ccc");
        myHashSet.add("ddd");
        myHashSet.add("eee");
        myHashSet.add("fff");
        myHashSet.add("ggg");
        myHashSet.add("hhh");
        myHashSet.add("iii");
        for (String s : myHashSet) {
            System.out.println(s);
        }  
    }
}