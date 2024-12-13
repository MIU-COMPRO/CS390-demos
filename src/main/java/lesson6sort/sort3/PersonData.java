package lesson6sort.sort3;

import java.util.Arrays;
import java.util.Comparator;

/**Sort-3-Comparator using Local Inner class */
public class PersonData {
	public static Person[] prepareData() {
		Person[] persons = 
			{new Person("Joe","Brown",4566.56), new Person("Bob","Roth",3455.23), 
			 new Person("Anne","Mary",6788.90), new Person("Tim","Cook",2345.67),
			 new Person("Rosy","Cook",4567.88)};
		return persons;
	}
	public static void main(String[] args) {
		
		Person[] persons1 = prepareData();
		PersonData ob = new PersonData();
		ob.salarySort(persons1 );
		
	}
	public void salarySort(Person[] p){
		class MySalaryComparator implements Comparator<Person> {
			@Override
            public int compare(Person p1, Person p2) {
                return Double.compare(p1.getSalary(), p2.getSalary());
            }
		}
		MySalaryComparator ob = new MySalaryComparator();
		Arrays.sort(p, ob);
		System.out.println(Arrays.toString(p));
	}
	
}
