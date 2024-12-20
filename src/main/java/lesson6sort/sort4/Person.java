package lesson6sort.sort4;

import java.util.Arrays;
import java.util.Comparator;

public class Person {
	private String fname;
	private String lname;
	private double salary;
	
	public Person(String n, String l, double salary) {
		fname = n;
		lname = l;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return fname + " " + lname + " " + salary;
	}
	static class InnerSort implements Comparator<Person> {
		@Override
        public int compare(Person p1, Person p2) {
            return Double.compare(p2.getSalary(), p1.getSalary());
        }
	}
	
	
}
