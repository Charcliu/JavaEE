package reflect;

public class Parent {
	public String p;
	public Parent(){System.out.println("Create Through Empty Constructor!");}
	public Parent(String p){this.p = p;}
	public void speak(){
		System.out.println("Parent Speak");
	}
	public void niangcu(){
		System.out.println("Parent Niangcu");
	}
}
