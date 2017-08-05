package _5._1;

public class ManagerTest {
	public static void main(String[] args) {
		Manager boss = new Manager("FeifeiWang", 80000, 1987, 12, 15);
		boss.setBouns(5000);
		Employee[] staff = new Employee[3];
		
		staff[0] = boss;
		staff[1] = new Employee("a", 50000, 1999, 2, 4);
		staff[2] = new Employee("b", 40000, 1999, 2, 4);
		
		for(Employee e : staff){
			System.out.println(e.getName() + " " + e.getSalary());
		}
		
		if(staff[1] instanceof Manager){
			System.out.println("True");
		}
	}
}
