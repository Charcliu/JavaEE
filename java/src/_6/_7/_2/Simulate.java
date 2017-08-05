package _6._7._2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import _6._7._1.Account;
import _6._7._1.AccountImpl;

public class Simulate {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		InvocationHandler handler = new DynamicProxy(realSubject);
		
		Subject subject = (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject
                .getClass().getInterfaces(), handler);
		
		subject.rent();
		subject.hello("Flunetly");
		
		Account realAccount = new AccountImpl();
		InvocationHandler handlerAccount = new DynamicProxy(realAccount);
		Account account = (Account)Proxy.newProxyInstance(handlerAccount.getClass().getClassLoader(), realAccount
                .getClass().getInterfaces(), handlerAccount);
		account.queryAccount();
		account.updateAccount();
		
	}
}
