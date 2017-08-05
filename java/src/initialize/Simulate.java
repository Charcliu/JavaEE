package initialize;

public class Simulate {

	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
	
	Simulate(int i){

	}

	Simulate(String str){
		this(1);
	}
	
	Simulate(String str, int i){
		this("1");
		int i1 = 1;
	}
	
	static int j = 1;
	int j1 = 1;
	
	/**
	 * 静态方法内部只能够调用静态方法或者变量,方法内部不能定义静态变量
	 */
	static void test1(){
		int u = 0;
		j++;
	}
	
	void test2(){
		j++;
		j1++;
		test1();
	}
}
