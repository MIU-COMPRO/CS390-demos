package lesson10.setapi;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String args[]) {
		// Create a tree set
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		ts.add("B");
		System.out.println(ts);
	}
}
