package fuck;

import java.util.Arrays;

public class fuckMain {
	/**
	 * 成员变量
	 */
	simple simp;
	
	int i;
	/**
	 * 主启动类
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b[] objB = new b[3];
		for(int i = 0; i < objB.length; i++){
			objB[i] = new b(String.valueOf(i));
			System.out.println(objB[i]);
		}
		Arrays.toString(objB);
		System.out.println(objB);
		System.out.println(objB.getClass());
		fuck(objB);
		simple s = simple.FLAMING;
		System.out.println("ordinal..." + s.ordinal());
		for(simple s1 : simple.values()){
			System.out.println("enum list" + s1);
		}
		s.toString();
		System.out.println(s);
		fuckMain fuckM = new fuckMain(simple.HOT);
		fuckM.description();
		fuckM.fuck().fuck().fuck().print();
	}
	
	/**
	 * 成员函数
	 */
	public void description(){
		switch(simp){
		case HOT: System.out.println("HOT");
			break;
		default:
			break;
		}
	}
	
	/**
	 * 构造器
	 * @param simp
	 */
	fuckMain(simple simp){
		this.simp = simp;
	}
	
	/**
	 * 类函数
	 * @param strings
	 */
	public static void fuck(b...strings){
		for(b b : strings){
			System.out.println(b);
		}
	}

	private fuckMain fuck(){
		i++;
		/*
		 * this表示调用方法对象的引用
		 */
		return this;
	}
	
	void print(){
		System.out.println(i);
	}

}
