package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Simulate {
	public static void main(String[] args) {
		Son p = new Son();
		p.speak();
		p.niangcu();
		System.out.println(p.getClass().getName());
		Field[] f = p.getClass().getFields();
		for(Field fd : f){
			System.out.println("Field " + fd.getName());
		}
		Constructor[] c = p.getClass().getConstructors();
		for(Constructor ct : c){
			System.out.println("Constructor " + ct.toString());
		}
		Method[] m = p.getClass().getMethods();
		for(Method mt : m){
			System.out.println("Method " + mt.getName());
		}
		try {
			Parent p1 = p.getClass().newInstance();
			p1.speak();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
