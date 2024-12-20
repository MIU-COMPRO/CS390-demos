package lesson11.hashapi;
import java.util.*;
// Hash table implementation for User defined class Emp1
public class HashtableDemo {
		public static void main(String[] args) {
		 // Value may be any collection
		// Hashtable<String,ArrayList<Course>> list = new Hashtable<>();	 
		 Hashtable<Integer,Empl> tm = new Hashtable<Integer,Empl>();
		// tm.put(null, new Empl(134,"Ramu",3500)); // Does not allow null key null value
		 tm.put(1, new Empl(134,"Ramu",3000));
		 tm.put(5, new Empl(235,"Jony",6000));
		 tm.put(3, new Empl(876,"Crish",2000));
		 tm.put(4, new Empl(512,"Tom",2400));
		 tm.put(4, new Empl(512,"Tom",2500)); // Modify the value
	        System.out.println("Hashtable entries:");
	      System.out.println(tm);
	        
	      Set<Integer> keys = tm.keySet();
	        for(Integer key:keys){
	            System.out.println(key+" ==> "+tm.get(key));
	        }
	        tm.remove(4);
	       tm.replace(5, new Empl(235,"Jony", 3200));
	        System.out.println(tm);
	}
}
class Empl{
    private String name;
    private int salary;
    private int id;
     
    public Empl(int id, String n, int s){
        this.id = id;
        this.name = n;
        this.salary = s;
    }
    public String toString() {
    	return STR."""
\{id}
\{name}
\{salary}
""";
     	}
}
