package jar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import _6._7._2.DynamicProxy;
import _6._7._2.RealSubject;
import _6._7._2.Subject;

public class Simulate {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		InvocationHandler handler = new DynamicProxy(realSubject);
		
		Subject subject = (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject
                .getClass().getInterfaces(), handler);
		
		subject.rent();
		subject.hello("Flunetly");
	}
}
