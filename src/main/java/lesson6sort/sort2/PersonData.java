package lesson6sort.sort2;

import lesson6sort.sort1.FirstNameComparator;

import java.util.Arrays;
import java.util.Comparator;

/** Sort2-Comparator using Member Inner class */
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
		System.out.println("Before Sorting: " + Arrays.toString(persons1));
		Arrays.sort(persons1, ob.getMySort());
		System.out.println("After sorting: " + Arrays.toString(persons1));
		
		
	}	
	private class MySort implements Comparator<Person>{
		@Override
        public int compare(Person p1, Person p2) {
            return p1.getLname().compareTo(p2.getLname());
        }

	}
	public MySort getMySort(){
		return new MySort();
	}
}
