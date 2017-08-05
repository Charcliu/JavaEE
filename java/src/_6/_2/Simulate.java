package _6._2;

import java.util.Arrays;

public class Simulate {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new Employee("Carl Cracker", 75000);
		staff[2] = new Employee("Tony Testter", 38000);

		Arrays.sort(staff);
		
		for(Employee e : staff){
			System.out.println(e.getName() + " " + e.getSalary());
		}
		
		System.out.println(staff[0] instanceof Comparable);
	}
}
