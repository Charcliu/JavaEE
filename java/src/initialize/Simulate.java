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
	 * ��̬�����ڲ�ֻ�ܹ����þ�̬�������߱���,�����ڲ����ܶ��徲̬����
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
