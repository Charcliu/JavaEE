package fuck;

import java.util.Arrays;

public class fuckMain {
	/**
	 * ��Ա����
	 */
	simple simp;
	
	int i;
	/**
	 * ��������
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
	 * ��Ա����
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
	 * ������
	 * @param simp
	 */
	fuckMain(simple simp){
		this.simp = simp;
	}
	
	/**
	 * �ຯ��
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
		 * this��ʾ���÷������������
		 */
		return this;
	}
	
	void print(){
		System.out.println(i);
	}

}
