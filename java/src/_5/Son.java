package _5;

public class Son extends Parent {
	private String sex;
	public Son(String name, String age, String sex) {
		super(name, age);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
