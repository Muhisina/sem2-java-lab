import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_String_Comparator_Ex {
    public static void main(String[] args) {
       
		 // A custom comparator that compares two Strings by their length.
        
		Comparator<String> str_Length = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };


        // Create a Priority Queue with a custom Comparator
        PriorityQueue<String> ob= new PriorityQueue<String>(str_Length);

        // Add items to a Priority Queue (ENQUEUE)
        ob.add("Lisa");
        ob.add("Robert");
       ob.add("John");
        ob.add("Chris");
        ob.add("Angelina");
        ob.add("Joe");

        // Remove items from the Priority Queue 
        while (!ob.isEmpty()) {
            System.out.println(ob.remove());
        }
    }
}