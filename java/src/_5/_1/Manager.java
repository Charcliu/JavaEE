package _5._1;

public class Manager extends Employee {

	private double bouns;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bouns = 0;
	}

	public double getBouns() {
		return bouns;
	}

	public void setBouns(double bouns) {
		this.bouns = bouns;
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bouns;
	}
}
