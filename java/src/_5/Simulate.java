package _5;

import java.util.ArrayList;

public class Simulate {
	public static void main(String[] args) {
		Son s= new Son("1", "2", "3");
		System.out.println(s.getName() + " " + s.getAge() + " " + s.getSex());
		
		String s1 = "s";
		String s2 = new String("s");
		System.out.println(s1 == s2);
		
		System.out.println(s.toString());
		ArrayList<Son> list = new ArrayList<Son>(100);
		list.add(s);
		Integer i = null;
		i = 0;
		System.out.println(list.size());
		int i1 = 1;
		System.out.println(i1);
		change(i1);
		System.out.println(i1);
		System.out.println(Integer.class.getName());
	}
	 
	public static void change(Integer i){
		i = i * 2;
	}
}
