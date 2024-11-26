package lesson10.setapi;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeAPIDemo {
	public static void main(String[] args) {
		TreeSet<String> col1 = new TreeSet<>();
		boolean res = col1.add("Java");
		System.out.println(res);
		System.out.println(col1);
		System.out.println("Size = " + col1.size());

		res = col1.add("Java");
		System.out.println(res);
		System.out.println(col1);
		System.out.println("Size = " + col1.size());
		col1.add("Angular");
		col1.add("HTML");
		System.out.println(col1);
		System.out.println("Size = " + col1.size());

		TreeSet<Apple> app = new TreeSet<Apple>();
		 app.add(new Apple("Red",4.5,6.7));
		 app.add(new Apple("Green",2.5,4.7));
		 app.add(new Apple("Yellow",4.5,3.4));
		 System.out.println(app);
		 
		 TreeSet<Apple> app1 = new TreeSet<Apple>(new AppleColorCom());
		 app1.add(new Apple("Red",4.5,6.7));
		 app1.add(new Apple("Green",2.5,4.7));
		 app1.add(new Apple("Yellow",4.5,3.4));
		 System.out.println(app1);
			 
	TreeMap<String,String> cmap = new TreeMap<>();
	cmap.put("CS390", "FPP");
	cmap.put("CS401", "MPP");
	cmap.put("CS421", "Algorithms");
	cmap.put("CS473", "MDP");
	System.out.println(cmap);
	cmap.put("CS421", "Advanced Algorithm");
	System.out.println(cmap);
	// How to retrieve the value
	String val = cmap.get("CS390");
	System.out.println(val);
	TreeMap<String,Apple> cmap1 = new TreeMap<>();
	}
}
